package orderapp.dao;

import java.util.List;

import orderapp.data.Customer;
import orderapp.exceptions.CustomerNotFoundException;

public interface CustomerDAO {
//	CRUD
	
//	READ
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException;
	public List<Customer> getAllCustomers();
	
//	Create 
	public Integer addCustomer(Customer customerInfo);
	
//	Update 
	public Integer updateCustomer(Customer updatedCustomerInfo);
	
// Delete
	public Integer deleteCustomerById(Integer customerId);

}
