package corejavaexample.main;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department departmentIT = new Department();
		departmentIT.setDepId(1);
		departmentIT.setDepName("IT");
		
		Department departmentFinance = new Department();
		departmentFinance.setDepId(2);
		departmentFinance.setDepName("Finance");
		
		Address addressOne = new Address();
		addressOne.addressId = 1;
		addressOne.setCity("Dewas");
		addressOne.setCountry("India");
		addressOne.setHouseName("PEACE");
		
		
		Employee employeeOne = new Employee();
		employeeOne.setEmpId(11);
		employeeOne.setEmpName("Nikhil Dubey");
		employeeOne.setSalary(1500.0);
		employeeOne.setAddress(addressOne);
		employeeOne.setDepartment(departmentIT);
		
		System.out.println(employeeOne.getEmpName());
		
		
	}

}
