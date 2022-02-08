package daythree.exceptionss.trying;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService cs = new CustomerService();
		try {
		cs.getCustomer(2);
		}catch(CustomerNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		System.out.println("FINALLY DONE!");
		
	}

}
