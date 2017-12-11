/**
 * 
 */
package fr.epita.datamodel;

import fr.epita.contracts.Geometry;

/**
 * Enterprise data object representing the 2-dimensional circle.
 * 
 * @author raaool
 *
 */
public class Circle implements Geometry {

	/**The radius of the circle.*/
	private double radius;
	
	private static final double pi=3.14159265358979323846264338327950288419716939937510d;
	
	/**
	 * Default Constructor
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Parameterised Constructor
	 * @param radius The radius of the circle.
	 */
	public Circle(double radius) {
		this.radius=radius;
	}
	
	/** 
	 * Returns the area of the circle.
	 * @see fr.epita.contracts.Geometry#getArea()
	 */
	@Override
	public double getArea() {
		return pi * radius * radius;
	}

	/** 
	 * Returns the perimeter of the circle.
	 * @see fr.epita.contracts.Geometry#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return (2 * pi * radius);
	}
	
	@Override
	public String toString() {
		return "Circle [area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}

}
