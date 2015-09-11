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

public class Sphere extends ThreeDimensionalShape{

	//x from the parent class is same as the radius of the Sphere
	//Sphere attribute is radius, in this case radius is x
	Sphere()//default constructor
	{
		setIdentifier("Sphere");
	}
	Sphere(double radius)//overload constructor to assign the radius of the sphere
	{
		setX(radius);
		setIdentifier("Sphere");
	}
	Sphere(double radius, String color)
	{
		setX(radius);
		setColor(color);
		setIdentifier("Sphere");
	}
	
	
	void setRadius(double radius)
	{
		setX(radius);
	}
	
	//getter methods
	double getRadius()
	{
		return getX();//return radius
	}
	
	double getArea() {
		return 4 * Math.PI *(Math.pow(getX(), 2));//area of sphere is 4PI x radius^2
	}
	double getVolume()
	{
		return (4/3) * Math.PI *Math.pow(getX(), 3);//volume of sphere is 4/3 Pi x radius^3
	}
	
	
	/*Version 2
	 * 
	 * protected double radius
	 * Sphere()//default constructor
	{
		setIdentifier("Sphere");
	}
	Sphere(double assignRadius)//overload constructor to assign the radius of the sphere
	{
		setRadius(assignRadius);
		setIdentifier("Sphere");
	}
	Sphere(double assignRadius, String color)
	{
		setRadius(assignRadius);
		setColor(color);
		setIdentifier("Sphere");
	}
	
	
	void setRadius(double assignRadius)
	{
		this.radius = assignRadius;
	}
	
	//getter methods
	double getRadius()
	{
		return getX();//return radius
	}
	
	double getArea() {
		return 4 * Math.PI *(Math.pow(this.radius, 2));//area of sphere is 4PI x radius^2
	}
	double getVolume()
	{
		return (4/3) * Math.PI *Math.pow(this.radius, 3);//volume of sphere is 4/3 Pi x radius^3
	}
	 * 
	 */
}

