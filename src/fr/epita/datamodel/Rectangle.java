/**
 * 
 */
package fr.epita.datamodel;

import fr.epita.contracts.Geometry;

/**
 * Enterprise data object representing the 2-dimensional Rectangle.
 * 
 * @author raaool
 *
 */
public class Rectangle implements Geometry {

	/**The height of the quadrilateral. */
	private double height;
	
	/**The weight of the quadrilateral. */
	private double weight;
	
	/**
	 * Default Constructor
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Parameterised Constructor
	 * 
	 * @param height The height of the Rectangle
	 * @param weight The weight of the Rectangle
	 */
	public Rectangle(double height,double weight) {
		this.height=height;
		this.weight=weight;
	}
	
	/**
	 * To get the area of the rectangle.
	 * 
	 * @see fr.epita.contracts.Geometry#getArea()
	 */
	@Override
	public double getArea() {
		return height * weight;
	}

	/**
	 * To get the perimeter of the rectangle.
	 * 
	 * @see fr.epita.contracts.Geometry#getPerimeter()
	 */
	@Override
	public double getPerimeter() {
		return 2*(height+weight);
	}

	@Override
	public String toString() {
		return "Rectangle [area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}
}
