package daythree.exceptionss.trying;

public class CustomerService {
	
	public Customer getCustomer(int customerId) throws CustomerNotFoundException {
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Nikhil");
		
		try {
			if(customerId != cust.getId()) {
				throw new CustomerNotFoundException("Customer Nhi Mila Bhenchod"); 
			}
		}catch(CustomerNotFoundException cnfe) {
			System.out.println("CUST NHI MILA");
			throw cnfe;
		}
		
		
		return cust;
	}

}
