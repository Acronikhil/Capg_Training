package corejavaexample.main;


import java.util.Date;

public class AddressMain {
	
	public static void main(String args[]) {
		Address address = new Address();
		address.setCity("INDORE");
		address.setCountry("India");
		address.setHouseName("88");
		
		System.out.println(address.getCity());
		
		Customer customer = new Customer();
		customer.setCustomerName("NIKHIL");
		customer.setDateOfBirth(new Date());
		customer.setAddress(address);
		
		System.out.println(customer.getCustomerName());
		
		
		Customer customer2 = new Customer();
		customer2.setCustomerName("Dubey");
		customer2.setDateOfBirth(new Date());
		customer2.setAddress(address);
		
		System.out.println(customer2.getCustomerName());
		
		
		
	}
}
