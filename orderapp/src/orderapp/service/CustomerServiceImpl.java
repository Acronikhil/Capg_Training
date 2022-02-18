package orderapp.service;

import java.util.List;

import orderapp.dao.CustomerDAO;
import orderapp.dao.CustomerDAOImpl;
import orderapp.data.Customer;
import orderapp.exceptions.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDAO customerDAO = new CustomerDAOImpl();
	
	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException {
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customerDAO.getAllCustomers();
	}

	@Override
	public Integer addCustomer(Customer customerInfo) {
		return customerDAO.addCustomer(customerInfo);
	}

	@Override
	public Integer updateCustomer(Customer updatedCustomerInfo) {
		return customerDAO.updateCustomer(updatedCustomerInfo);
	}

	@Override
	public Integer deleteCustomerById(Integer customerId) {
		return customerDAO.deleteCustomerById(customerId);
	}

}
