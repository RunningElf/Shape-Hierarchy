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

public class Cube extends ThreeDimensionalShape{
	
	//x is the same as side; as Cube all sides are equal y and z are the same size as x
	//Cube attribute is side, in this case side is the same as x
	Cube()//default constructor
	{
		setIdentifier("Cube");
	}
	Cube(double side)//overload constructor to assign side
	{
		setSide(side);//enter method to assign side
		setIdentifier("Cube");
	}
	Cube(double side, String color)
	{
		setSide(side);
		setColor(color);
		setIdentifier("Cube");
	}

	
	//setter method to assign side of Cube
	void setSide(double side)
	{
		setX(side);//set side with user input
		setY(side);
		setZ(side);
	}
	
	
	//getter methods
	double getArea() {
		return 6 *(Math.pow(getX(), 2)); // Area of Cube: 6 x side^2
	}
	double getVolume()
	{
		return Math.pow(getX(), 3); // Volume of Cube: side^3
	}
	double getSide()
	{
		return getX();//return the side of the cube
	}
	
	
	/*version 2
	 * protected double side;
	 * 
	 * Cube()//default constructor
	{
		setIdentifier("Cube");
	}
	Cube(double assignSide)//overload constructor to assign side
	{
		setSide(assignSide);//enter method to assign side
		setIdentifier("Cube");
	}
	Cube(double assignSide, String color)
	{
		setSide(assignSide);
		setColor(color);
		setIdentifier("Cube");
	}

	
	//setter method to assign side of Cube
	void setSide(double assignSide)
	{
		this.side = assignSide;
	}
	
	
	//getter methods
	double getArea() {
		return 6 *(Math.pow(this.side, 2)); // Area of Cube: 6 x side^2
	}
	double getVolume()
	{
		return Math.pow(this.side, 3); // Volume of Cube: side^3
	}
	double getSide()
	{
		return this.side;//return the side of the cube
	}
	 */
}
