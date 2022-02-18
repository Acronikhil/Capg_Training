package dayeleven.jdbcapp.dao;

import java.util.List;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;

public interface CustomerDAO {
	// CRUD operation

//Retrieve Data
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException, CustomerAlreadyExistsException;

	public List<Customer> getAllCustomers() throws CustomerNotFoundException;

//	Create
	public Integer addCustomer(Customer customer);

//	Update
	public Integer updateCustomer(Customer customer);

//	Delete
	public Integer deleteCustomer(Integer customerId);

}
