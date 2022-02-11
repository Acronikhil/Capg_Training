package dayseven.methodrefrence;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("Harsh", 98);
		
		
		SetStudent ss = Student::new;
		System.out.println(ss.setStudentData("Nikhil Dubey", 50));
		
		Other oth = s::showData;
		oth.display();
		

	}

}
