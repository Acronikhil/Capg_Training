package statictest;

public class Student {

	private Integer rollNumber;
	private String studentName;
	static String collegeName = "IIT";
	
	

	public Student(Integer rollNumber, String studentName) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
	}
	
	void display() {
		System.out.println("Roll Number ------"+this.rollNumber+"-----student Name----"+this.studentName+"-----collegename----"+collegeName);
	}
	
	public static void changeCollegeName(String name) {
		collegeName = name;
	}
	
}
