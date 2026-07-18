package Abstraction;
abstract class Shape{
	abstract void calculateArea();
	abstract void calculatePerimeter();
}

class Quadrilaterial extends Shape {

	@Override
	void calculateArea() {
		System.out.println("This calculate area");
		
	}

	@Override
	void calculatePerimeter() {
		System.out.println("This calculate perimeter");
		
	}
	
}
public class MainShape {

	public static void main(String[] args) {
		Shape s1 = new Quadrilaterial();
		s1.calculateArea();
		s1.calculatePerimeter();

	}

}

