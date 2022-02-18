package orderapp.ui;

import orderapp.data.Customer;
import orderapp.exceptions.CustomerNotFoundException;
import orderapp.service.CustomerService;
import orderapp.service.CustomerServiceImpl;

public class OrderApp {

	public static void main(String[] args) {

		Customer customer = new Customer();
		CustomerService customerService = new CustomerServiceImpl();
		try {
			System.out.println(customerService.getCustomerById(1));
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
