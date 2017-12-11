/**
 * 
 */
package fr.epita.datamodel;

/**
 * Enterprise data object representing a 2 dimensional square
 * 
 * @author raaool
 */
public class Square extends Rectangle {
	
	/** The side of the square*/
	private double side;
	
	/**
	 * Default Constructor
	 */
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(double side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Square [area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}
}
