package junitexample;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import dayeleven.jdbcapp.dao.CustomerDAOImpl;
import dayeleven.jdbcapp.data.Customer;
import dayeleven.jdbcapp.exceptions.CustomerAlreadyExistsException;
import dayeleven.jdbcapp.exceptions.CustomerNotFoundException;

class GetCust {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerById() {
		LocalDate d = LocalDate.parse("2001-01-20"); 
		Customer c = new Customer(1,"Nikil Dubey", d, 8962132378L, "nikhil@gmail.com");
		CustomerDAOImpl cust = new CustomerDAOImpl();
		try {
			Customer result = cust.getCustomerById(5);
			

			assertEquals(result, c);
		
		} catch (CustomerNotFoundException e) {
			// TODO Auto-generated catch block
			CustomerNotFoundException thrown = assertThrows(CustomerNotFoundException.class, ()-> {
				cust.getCustomerById(2);
			}, "Customer Not Found Exception Was Expected") ;
//			
			assertEquals(CustomerNotFoundException.class, e.getClass());
			
			e.printStackTrace();
		} catch (CustomerAlreadyExistsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
