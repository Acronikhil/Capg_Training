package com.jpa.jpademo.services;

import com.jpa.jpademo.data.Employee;

public interface EmployeeServices {

	public Employee getEmployee(Integer empId);

	public void addEmployee(Employee emp);

	public void deleteEmployee(Employee emp);

}
