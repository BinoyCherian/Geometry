/**
 * 
 */
package fr.epita.datamodel;

import fr.epita.contracts.Geometry;

/**
 * Enterprise class object representing a 2-dimensional triangle
 * @author raaool
 *
 */
public class Triangle implements Geometry {

	/** The base of the triangle. */
	private double base;
	
	/** The height of the triangle. */
	private double height;
	
	/** The first side of the triangle. */
	private double sideA;
	
	/** The second side of the triangle. */
	private double sideB;
	
	/**
	 * Default Constructor
	 */
	public Triangle() {
	}
	
	/**
	 * Parameterised Constructor
	 * 
	 * @param base The base of the triangle
	 * @param height The height of the triangle
	 * @param sideA The first side of the triangle
	 * @param sideB The second side of the triangle
	 */
	public Triangle(double base, double height, double sideA, double sideB) {
		
		this.base=base;
		this.height=height;
		this.sideA=sideA;
		this.sideB=sideB;
	}
	
	
	/**
	 * To get the area of a triangle.
	 * 
	 * @see fr.epita.contracts.Geometry#getArea()
	 * @return double Area of the Triangle
	 */
	@Override
	public double getArea() {
		return (height*base)/2;
	}

	/**
	 * To get the perimeter of the triangle.
	 * 
	 * @see fr.epita.contracts.Geometry#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return base+sideA+sideB;
	}

	@Override
	public String toString() {
		return "Triangle [area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}
}
