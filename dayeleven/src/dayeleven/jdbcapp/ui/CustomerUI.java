package dayeleven.jdbcapp.ui;

import java.time.LocalDate;

import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;
import dayeleven.jdbcapp.service.CustomerService;
import dayeleven.jdbcapp.service.CustomerServiceImpl;

public class CustomerUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerServiceImpl();

/*		Customer customer = new Customer();
		Customer customer = new Customer(1,"Nikil Dubey",LocalDate.of(2001,01,20),8962132378L,"nikhil@gmail.com");
		System.out.println(customerService.addCustomer(customer));
*/		
		
/*		System.out.println(customer = customerService.getCustomerById(2));
		System.out.println(customer);
		System.out.println(customerService.updateCustomer(customer));
*/
		try {
			System.out.println(customerService.getCustomerById(2));
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (CustomerAlreadyExistsException e) {
			System.out.println(e.getMessage());
		}
		
//		System.out.println(customerService.deleteCustomer(1));
		
/*		try {
			System.out.println(customerService.getAllCustomers());
		} catch (CustomerNotFoundException e) {
		
			System.out.println(e.getMessage());
		}
*/
	}

}
