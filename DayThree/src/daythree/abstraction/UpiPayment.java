package daythree.abstraction;

public class UpiPayment implements PaymentInterface{
	@Override
	public void receivePayment() {
		// TODO Auto-generated method stub
	System.out.println("Receive Payment using UPI");	
	}
	@Override
	public void displayPaymentInformation() {
		// TODO Auto-generated method stub
		System.out.println("Displaying paymetn info");
		
	}
}
