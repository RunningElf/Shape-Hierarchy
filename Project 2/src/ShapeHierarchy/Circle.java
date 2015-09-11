/*10.13 - Project: Shape Hierarchy
Implement the Shape hierarchy shown in Fig. 9.3. Each Two-DimensionalShape should contain method getArea 
to calculate the area of the two-dimensional shape. Each ThreeDimensionalShape should have methods getArea
and get Volume to calculate the surface area and volume, respectively, of the three-dimensional shape. 
Create a program that uses an array of Shape references to objects of each concrete class in the hierarchy
The program should print a text description of the object to which each array element refers. Also,
in the loop that processes all the shapes in the array, determine whether each shape is a TwoDimensionalShape
or a ThreeDimensionalShipe. If it's a TwoDiminsionalShape, display it's area. If it's a Three DimensionalShape,
display its area and volume.

*
*
*Course Number & Section: CIS5200
Assignment Designation: Project 2 Chapter 10.3
Name: Nikkita Hirayama
*/

package ShapeHierarchy;

import java.lang.Math;

public class Circle extends TwoDimensionalShape{
	
	//x from the parent class is same as the radius of the Circle
	//Circle attribute is radius in this case radius is x
	Circle()//default constructor
	{
		setIdentifier("Circle");
	}
	
	Circle(double radius)//constructor that assigns radius
	{
		setX(radius);
		setIdentifier("Circle");
		
	}
	
	Circle(double radius, String color)
	{
		setX(radius);
		setColor(color);
		setIdentifier("Circle");
	}
	
	void setRadius(double radius)
	{
		setX(radius);
	}
	
	double getRadius()
	{
		return getX();
	}
	//override method for area specific to a circle
	double getArea()
	{
		return  (Math.PI * Math.pow(getX(), 2));// return Pi (radius ^2)
	}

	/*Version 2
	 * protected double radius;
	 * Circle()//default constructor
	{
		setIdentifier("Circle");
	}
	
	Circle(double assignRadius)//constructor that assigns radius
	{
		setRadius(assignRadius);
		setIdentifier("Circle");
		
	}
	
	Circle(double assignRadius, String color)
	{
		setRadius(assignRadius);
		setColor(color);
		setIdentifier("Circle");
	}
	
	void setRadius(double assignRadius)
	{
		this.radius = assignRadius;
	}
	
	double getRadius()
	{
		return this.radius;
	}
	//override method for area specific to a circle
	double getArea()
	{
		return  (Math.PI * Math.pow(this.radius, 2));// return Pi (radius ^2)
	}
	 */
}
