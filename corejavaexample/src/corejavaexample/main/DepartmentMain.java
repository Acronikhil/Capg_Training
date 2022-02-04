package corejavaexample.main;

public class DepartmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Using default Constructor
		Department department = new Department();
		department.setDepId(15);
		department.setDepName("Marketing");
		
//		Using parameterized constructor
		Department departmentUsingParam = new Department(16, "Finance");
		System.out.println(departmentUsingParam.getDepName());
		System.out.println(department.getDepName());
		
	}

}
