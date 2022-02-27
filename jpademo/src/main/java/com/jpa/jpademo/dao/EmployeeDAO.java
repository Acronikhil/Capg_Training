package com.jpa.jpademo.dao;

import com.jpa.jpademo.data.Employee;

public interface EmployeeDAO {

	public Employee getEmployee(Integer empId);

	public void addEmployee(Employee emp);

	public void deleteEmployee(Employee emp);
}
