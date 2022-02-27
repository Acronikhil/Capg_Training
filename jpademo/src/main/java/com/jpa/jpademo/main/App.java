package com.jpa.jpademo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.jpademo.data.Employee;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(3,"Happu Daroga");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpademo");
		EntityManager em = emf.createEntityManager();
		//Inserting data in database using persist method of EntityManager
		em.getTransaction().begin();
		em.persist(emp); 
		em.getTransaction().commit();
		
		// Read data from database relational teble
		em.getTransaction().begin();
		Employee emp2 = em.find(Employee.class, 3);
		em.getTransaction().commit();
		System.out.println(emp2);
		
		// Delete
		em.getTransaction().begin();
		em.remove(emp);
		em.getTransaction().commit();
		
		
		

	}

}
