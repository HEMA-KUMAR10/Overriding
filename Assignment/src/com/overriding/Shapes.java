package com.overriding;

public class Shapes {
		private static Circle Circle;

		void perimeter() {
			System.out.println("The perimeter function from the parent class");
		}
public class Circle extends Shapes{
	 double perimeter(double radius) {
		 double periCircle = 2*3.14*radius;
	     return periCircle;
	 }
}
public class Square extends Shapes{
	 double perimeter(double sides) {
		  double periSquare = 4*sides;
		  return periSquare;
	 }
}
public class Rectangle extends Shapes{
	 double perimeter(double length, double width) {
		  double periRectangle = 2*(length + width);
		  return periRectangle;
	 }
}		
		
	public static void main(String[] args) {
		Shapes object1 = new Shapes();	
		object1.perimeter();
		Circle object2=object1.new Circle();
		System.out.println("\nThe perimeter of the Circle of radius 6.44cm");
		System.out.print(object2.perimeter(6.44));
		Square object3 =object1.new Square();
		System.out.println("\n\n The perimeter of the Square of sides 8cm");
		System.out.print(object3.perimeter(8));
		Rectangle object4 =object1.new Rectangle();
		System.out.println("\n\n The perimeter of the Rectangle of length 4.41cm and width 6.23cm");
		System.out.print(object4.perimeter(4.41, 6.23));
		

	}

}
