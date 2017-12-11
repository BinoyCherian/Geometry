/**
 * 
 */
package fr.epita.launcher;

import java.util.Random;

import fr.epita.datamodel.Circle;
import fr.epita.datamodel.Rectangle;
import fr.epita.datamodel.Square;
import fr.epita.datamodel.Triangle;

/**
 * The Main class for the geometry project
 * 
 * @author raaool
 */
public class MainGeometry {

	/**
	 * The static main method to launch the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		switch (new Random().nextInt(4))
		{
			case 0: createObject(new Circle());
			break;
			
			case 1: createObject(new Rectangle());
			break;
			
			case 2: createObject(new Square());
			break;
			
			case 3: createObject(new Triangle());
			break;
		}

	}

	/**
	 * Creates an object and returns value.
	 * 
	 * @param object
	 */
	public static void createObject(Object object) {
		if(object instanceof Triangle) {
			object=new Triangle(new Random().nextDouble(),new Random().nextDouble(),
					new Random().nextDouble(), new Random().nextDouble());
			
		}else if(object.getClass().equals(Rectangle.class)) {
			object=new Rectangle(new Random().nextDouble(), new Random().nextDouble());
			
		}else if(object instanceof Circle) {
			object=new Circle(new Random().nextDouble());
		}else if(object instanceof Square) {
			object=new Square(new Random().nextDouble());
		}
		
		System.out.println(object);
	}

}
