package orderapp.exceptions;

public class OrderNotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	@Override
	public String toString() {
		return "OrderNotFoundException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public OrderNotFoundException(String message) {
		super();
		this.message = message;
	}

}
