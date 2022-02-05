package methodoverloading;

public class Box {
	private double doubleValue;
//	Overloaded constructor
	public Box() {
		
	}
	
//	overloaded constructor
	public Box(double doubleValue) {
		this.doubleValue = doubleValue;
	}
	
//	Overloaded method- In java it is possible to define one ore more methods that share same name 
//	as long as their parameter declarations, order of parameters are different
	public void calculateVolume(int length, int breadth, int height) {
		System.out.println(length*breadth*height);
	}
	
	public void calculateVolume(int length, double breadth, int height) {
		System.out.println(length*breadth*height);
	}
	
	
//	Assuming box is square
	public void calculateVolume(int side) {
		System.out.println(side*side*side);
	}
	
//	Assuming box is square
	public void calculateVolume(double side) {
		System.out.println(side*side*side);
	}
}
