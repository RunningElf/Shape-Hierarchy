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

public class ThreeDimensionalShape extends Shape{

	protected double x, y, z;
	
	
	
	ThreeDimensionalShape()
	{
	
		setIdentifier("Three Dimensional Shape");
	}
	ThreeDimensionalShape(double assignX, double assignY, double assignZ)
	{
		setX(assignX);
		setY(assignY);
		setZ(assignZ);
		setIdentifier("Three Dimensional Shape");
	}
	
	//setter methods
	void setX(double assignX)
	{
		this.x = assignX;
	}
	void setY(double assignY)
	{
		this.y = assignY;
	}
	void setZ(double assignZ)
	{
		this.z = assignZ;
	}
	
	
	//getter methods
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	double getZ()
	{
		return z;
	}
	double getArea() {
		return x * y;
	}
	double getVolume()
	{
		return x * y * z;
	}
	
	//methods to return true or false on either TwoDimensionalShapes or ThreeDimensionalShapes
	boolean isTwoDimensionalShape()
	{
		return false;
	}
	boolean isThreeDimensionalShape()
	{
		return true;
	}

}
