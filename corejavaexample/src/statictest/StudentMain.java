package statictest;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentOne = new Student(1, "Aditya");
		Student studentTwo = new Student(2, "Nikhil");
		
		studentOne.display();
		Student.changeCollegeName("Acro");
		studentTwo.display();
		
	}

}
