package fr.epita.launcher;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import fr.epita.datamodel.Circle;
import fr.epita.datamodel.Rectangle;
import fr.epita.datamodel.Square;
import fr.epita.datamodel.Triangle;

/**
 * Enterprise class to launch the same program via reflections.
 * 
 * @author raaool
 *
 */
public class ReflectionsLauncher {
	
	public static void main(String[] args) {

		switch (new Random().nextInt(4)) {

		case 0:
			//circle
			createObject(Circle.class);
			break;
			
		case 1:
			//Square
			createObject(Square.class);
			break;
		case 2: 
			//Triangle
			createObject(Triangle.class);
			break;
			
		case 3:
			//Rectangle
			createObject(Rectangle.class);
			break;

		}

	}
	
	/**
	 * Method to initialize the constructors as per switching in the main.
	 * 
	 * @param classObject The class object passed in the main
	 */
	@SuppressWarnings("unchecked")
	public static void createObject(Class classObject){
		
		Constructor<?> constructors;
		Object object = null;
		
		try {
			if (classObject == Circle.class || classObject == Square.class) {
				constructors = classObject.getConstructor(double.class);
				object = constructors.newInstance(new Random().nextDouble());
			} else if (classObject == Triangle.class) {
				constructors = classObject.getConstructor(double.class, double.class, double.class, double.class);
				object = constructors.newInstance(new Random().nextDouble(), new Random().nextDouble(),
						new Random().nextDouble(), new Random().nextDouble());

			} else if (classObject == Rectangle.class) {
				constructors = classObject.getConstructor(double.class, double.class);
				object = constructors.newInstance(new Random().nextDouble(), new Random().nextDouble());
			}

			System.out.println(object);
		}
		catch(NoSuchMethodException | SecurityException | InstantiationException |
				IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			
			System.out.println(e.getMessage());
		}
		
	}

}
