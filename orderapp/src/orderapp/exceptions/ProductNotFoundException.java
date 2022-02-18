package orderapp.exceptions;

public class ProductNotFoundException {
	private String message;

	@Override
	public String toString() {
		return "ProductNotFoundException [message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ProductNotFoundException(String message) {
		super();
		this.message = message;
	}

}
