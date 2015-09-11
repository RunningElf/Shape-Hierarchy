package ShapeHierarchy;

import java.util.Scanner;

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

public class TestShapes {

	private static Scanner input;

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[6];//array of shapes that allows for each concrete class in the hierarphy
		input = new Scanner(System.in);
		double x, y;//x and y from user inputs in regards to shape sizes
		
		
		//receives input from user in regards to circle, cube, sphere, square, tetrahedron, and triangle
		System.out.print("input circle radius: ");					//Circle info input
		x = input.nextDouble();
		System.out.print("input circle color: ");
		String color = input.next();
		shapes[0] = new Circle(x, color);
		
		System.out.print("\ninput cube side: ");					//Cube info input
		x = input.nextDouble();
		System.out.print("input cube color: ");
		color = input.next();
		shapes[1] = new Cube(x, color);
		
		System.out.print("\ninput Sphere radius: ");				//Sphere info input
		x = input.nextDouble();
		System.out.print("input Sphere color: ");
		color = input.next();
		shapes[2] = new Sphere(x, color);
		
		System.out.print("\ninput Square side: ");					//Square info input
		x = input.nextDouble();
		System.out.print("input Square color: ");
		color = input.next();
		shapes[3] = new Square(x, color);
		
		System.out.print("\ninput Tetrahedron edge length: ");		//Tetrahedron info input
		x = input.nextDouble();
		System.out.print("input Tetrahedron color: ");
		color = input.next();
		shapes[4] = new Tetrahedron(x, color);
		
		System.out.print("\ninput Triangle base: ");				//Triangle info input
		x = input.nextDouble();
		System.out.print("input Triangle height: ");
		y = input.nextDouble();
		System.out.print("input Triangle color: ");
		color = input.next();
		shapes[5] = new Triangle(x, y, color);
		
		
	
		for(int a = 0; a < shapes.length; a++)//a loop that will print out each shape and it's area and or volume
		{
			
			//every shape in the heirarchy contains a color, identifier and an area
			System.out.printf("The %s %s's area is %.3f", shapes[a].getColor(), 
					shapes[a].identifier, shapes[a].getArea());
			if(shapes[a].isTwoDimensionalShape())// if the shape is 2-d I do not need to print out volume
				System.out.println(", and is a 2-D shape.\n");
			else//if the shape is 3-d then volume needs to be printed
				System.out.printf(" the volume is %.3f, and is a 3-D shape.%n%n", ((ThreeDimensionalShape)shapes[a]).getVolume());
		}
	

	}

}
