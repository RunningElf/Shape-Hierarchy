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

public class Triangle extends TwoDimensionalShape{

	//protected double base, height;
	// x is the same as base, and y is the same as height
	//Triangle attributes are base and height, same as x and y
	Triangle()//default constructor
	{
		setIdentifier("Triangle");
	}
	Triangle(double base, double height)//overload constructor to assign base and height
	{
		//this.base = assignBase;
		//this.height = assignHeight;
		setX(base);
		setY(height);
		setIdentifier("Triangle");
		
	}
	Triangle(double base, double height, String color)
	{
		setX(base);
		setY(height);
		setColor(color);
		setIdentifier("Triangle");
	}
	
	//setter methods to assign variables
	void setBase(double base)
	{
		//this.base = assignBase;
		setX(base);
	}
	void setHeight(double height)
	{
		//this.height = assignHeight;
		setY(height);
	}
	
	//getter methods
	double getBase()
	{
		return getX();
	}
	double getHeight()
	{
		return getY();
	}
	
	double getArea()//returns area of triangle
	{
		return (.5 * getX() * getY());// (1/2)base x height
	}
	
	/*Version 2
	 * 
	 * 
	 * protected double base, height
	 * Triangle()//default constructor
	{
		setIdentifier("Triangle");
	}
	Triangle(double assignBase, double assignHeight)//overload constructor to assign base and height
	{
		setBase(assignBase);
		setHeight(assignHeight);
		setIdentifier("Triangle");
		
	}
	Triangle(double assignBase, double assignHeight, String color)
	{
		setBase(assignBase);
		setHeight(assignHeight);
		setColor(color);
		setIdentifier("Triangle");
	}
	
	//setter methods to assign variables
	void setBase(double assignBase)
	{
		this.base = assignBase;
	}
	void setHeight(double assignHeight)
	{
		this.height = assignHeight;
	}
	
	//getter methods
	double getBase()
	{
		return this.base;
	}
	double getHeight()
	{
		return this.height;
	}
	
	double getArea()//returns area of triangle
	{
		return (.5 * this.base * this.height);// (1/2)base x height
	}


	 */
}
