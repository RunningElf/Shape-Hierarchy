package ShapeHierarchy;

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



public abstract class Shape {
	protected String color, identifier;
	
	abstract double getArea();
	
	void setColor(String assignColor)
	{
		this.color = assignColor;
	}
	
	String getColor()
	{
		return color;
	}
	void setIdentifier(String setID)//sets and identifier to inform of what type of shape it is
	{
		this.identifier = setID;
	}
	String getIdentifier()
	{
		return this.identifier;
	}

	abstract boolean isTwoDimensionalShape();
	abstract boolean isThreeDimensionalShape();

}


