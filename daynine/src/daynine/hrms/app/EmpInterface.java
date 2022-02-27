package daynine.hrms.app;

import java.util.List;

import daynine.hrms.exceptions.EmployeeNotFoundException;

public interface EmpInterface {
	
	public <Employee> void findEmp() throws EmployeeNotFoundException;
	
}
