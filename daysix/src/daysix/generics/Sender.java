package daysix.generics;

import java.security.MessageDigest;

//	Sender class is declared as parameterized generic type of one parameter as T
public class Sender<T> {
	private T message;

	public T getMessage() {
		return message;
	}

	public void setMessage(T message) {
		this.message = message;
	}
	public void sendmessage() {
		System.out.println("Message Sent:"+message);
	}
}
