package com.jpa.jpademo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.jpademo.data.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpademo");
	EntityManager em = emf.createEntityManager();
	
	
	@Override
	public Employee getEmployee(Integer empId) {
		em.getTransaction().begin();
		Employee empData = em.find(Employee.class, empId);
		em.getTransaction().commit();
		return empData;
	}

	@Override
	public void addEmployee(Employee emp) {
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		System.out.println("Employee Added");

	}

	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}

}
