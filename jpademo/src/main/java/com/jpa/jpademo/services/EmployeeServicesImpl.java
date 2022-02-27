package com.jpa.jpademo.services;

import com.jpa.jpademo.dao.EmployeeDAO;
import com.jpa.jpademo.dao.EmployeeDAOImpl;
import com.jpa.jpademo.data.Employee;

public class EmployeeServicesImpl implements EmployeeServices {

	EmployeeDAO employeeDao = new EmployeeDAOImpl();
	
	@Override
	public Employee getEmployee(Integer empId) {

		return employeeDao.getEmployee(empId);
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeDao.addEmployee(emp);

	}

	@Override
	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);

	}

}
