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

public class Tetrahedron extends ThreeDimensionalShape{

	
	//x is same as length of edge - edgeLength is attribute of Tetrahedron
	//Tetrahedron attribute is edgeLength, same as x
	Tetrahedron()
	{
		setIdentifier("Tetrahedron");
	}
	Tetrahedron(double edgeLength)
	{
		setX(edgeLength);
		setIdentifier("Tetrahedron");
	}
	Tetrahedron(double edgeLength, String color)
	{
		setX(edgeLength);
		setColor(color);
		setIdentifier("Tetrahedron");
	}
	
	//setter method
	void setEdgeLength(double edgeLength)
	{
		setX(edgeLength);
	}
	

	//getter methods
	double getEdgeLegth()
	{
		return getX();
	}
	double getArea() {
		return Math.pow(3, .5) * Math.pow(getX(), 2); //area of Tetrahedron is 3^.5 x edge Length ^2
	}
	double getVolume()
	{
		//volume of Tetrahedron: 1/3 x surface area x height. Height = 2/3^.5 x edge length
		return (1/3) * getArea() * (Math.pow((2/3), .5)* getX());
	}
	
	/*Version 2
	 * 
	 * Tetrahedron()
	{
		setIdentifier("Tetrahedron");
	}
	Tetrahedron(double assignEdgeLength)
	{
		setEdgeLength(assignEdgeLength);
		setIdentifier("Tetrahedron");
	}
	Tetrahedron(double assingEdgeLength, String color)
	{
		setEdgeLength(assignEdgeLength);
		setColor(color);
		setIdentifier("Tetrahedron");
	}
	
	//setter method
	void setEdgeLength(double assignEdgeLength)
	{
		this.edgeLength = assignEdgeLength;
	}
	

	//getter methods
	double getEdgeLegth()
	{
		return this.edgeLength;
	}
	double getArea() {
		return Math.pow(3, .5) * Math.pow(this.edgeLength, 2); //area of Tetrahedron is 3^.5 x edge Length ^2
	}
	double getVolume()
	{
		//volume of Tetrahedron: 1/3 x surface area x height. Height = 2/3^.5 x edge length
		return (1/3) * getArea() * (Math.pow((2/3), .5)* this.edgeLength);
	}
	 */
}
