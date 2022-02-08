package daythree.abstraction;

public class PaymentInterfaceDemo {

	public static void main(String[] args) {
		UpiPayment upiPayment = new UpiPayment();
		upiPayment.displayPaymentInformation();
		upiPayment.receivePayment();
	}
}
