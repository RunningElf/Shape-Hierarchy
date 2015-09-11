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

public class Square extends TwoDimensionalShape{
	
	
	//x from the parent class is same as the side of a square
	
//Square attribute is side; in this case x and y are the sides
	Square()//default constructor
	{
		setIdentifier("Square");
	}
	Square(double side)//overload constructor to assign side
	{
		setSide(side);
		setIdentifier("Square");
	}
	Square(double side, String color)
	{
		setSide(side);
		setColor(color);
		setIdentifier("Square");
	}
	
	void setSide(double side)
	{
		setX(side);
		setY(side);
	}
	
	double getSide()
	{
		return getX();
	}
	
	double getArea()//return area of square
	{
		return Math.pow(getX(), 2);//side^2
	}
	
/*
 * protected double side;
 * 
 * Square()//default constructor
	{
		setIdentifier("Square");
	}
	Square(double assignSide)//overload constructor to assign side
	{
		setSide(assignSide);
		setIdentifier("Square");
	}
	Square(double assignSide, String color)
	{
		setSide(assignSide);
		setColor(color);
		setIdentifier("Square");
	}
	
	void setSide(double assignSide)
	{
		this.side = assignSide;
	}
	double getSide()
	{
		return this.side;
	}
	
	double getArea()//return area of square
	{
		return Math.pow(this.side, 2);//side^2
	}
	
 */
}
