package dayeleven.jdbcapp.service;

import java.util.List;

import dayeleven.jdbcapp.dao.CustomerDAO;
import dayeleven.jdbcapp.dao.CustomerDAOImpl;
import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO customerDAO = new CustomerDAOImpl();
	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerNotFoundException, CustomerAlreadyExistsException {
		
		return customerDAO.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomers() throws CustomerNotFoundException {
		// TODO Auto-generated method stub
		
		return customerDAO.getAllCustomers();
	}

	@Override
	public Integer addCustomer(Customer customer) {
		
		return customerDAO.addCustomer(customer);
	}

	@Override
	public Integer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDAO.updateCustomer(customer);
//		return null;
	}

	@Override
	public Integer deleteCustomer(Integer customerId) {

		return customerDAO.deleteCustomer(customerId);
	}

}
