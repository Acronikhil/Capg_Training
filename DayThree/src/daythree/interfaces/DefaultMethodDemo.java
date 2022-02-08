package daythree.interfaces;

public class DefaultMethodDemo {
	public static void main(String[] args) {
		DesplayMessageImpl dmi = new DesplayMessageImpl();
		dmi.displayMessage("Hello everyone"); //calling abstract method
		dmi.displayMessageMore(); //calling default method
		DisplayMessage.displayProperly("IM STATIC METHOD NA"); // calling static method using interface name
	}

}
