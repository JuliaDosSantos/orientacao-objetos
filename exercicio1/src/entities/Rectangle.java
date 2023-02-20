package entities;

public class Rectangle {
	
	public double widht;
	public double height;
	
	public double area() {
		return widht * height;
	}
	
	public double perimeter() {
		return 2 * (height + widht);
	}
	
	public double diagonal() {
		return Math.sqrt(widht * widht + height * height);
	
	}
	
	

}
