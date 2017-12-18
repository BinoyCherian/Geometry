package fr.epita.contracts;

/**
 * Contract containing two methods, getArea and getParameter for all the shapes.
 * 
 * @author raaool
 *
 */
public interface Geometry {
	
	/**
	 * To get the area
	 * @return double The area
	 */
	public double getArea();
	
	/**
	 * To get the perimeter
	 * 
	 * @return double The perimeter
	 */
	public double getPerimeter();
	

}
