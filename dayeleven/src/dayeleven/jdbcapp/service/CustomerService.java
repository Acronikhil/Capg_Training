package dayeleven.jdbcapp.service;

import java.util.List;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;

public interface CustomerService {
	// CRUD operation

	// Retrieve Data
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException, CustomerAlreadyExistsException;

	public List<Customer> getAllCustomers() throws CustomerNotFoundException;

//		Create
	public Integer addCustomer(Customer customer);

//		Update
	public Integer updateCustomer(Customer customer);

//		Delete
	public Integer deleteCustomer(Integer customerId);
	
//	Calling a storedProcedure
	public String callProcedure(Integer custId);
	

}
