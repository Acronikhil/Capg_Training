package daythree.interfaces;

public interface DisplayMessage {
	
//	abstract methyod without body
	public void displayMessage(String Message);

	
//	default method java 8 onwards
	default void displayMessageMore() {
		System.out.println("IM DEFAULT");
	}
	
//	static method java 8 onwards
	public static void displayProperly(String message) {
		System.out.println(message);
	}
	
}
