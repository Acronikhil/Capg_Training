package dayseven.methodrefrence;

public class Student {
	private String name;
	private double marks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	public Student(String name, double marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
	public void showData() {
		System.out.println(this);
	}
}
