package daysix.generics;

import java.util.Objects;

public class Mammal<T> {
	T message;
	
	
	public <T> void getMessage(){
		System.out.println("message: "+message);
	}


	public Mammal() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Mammal(T message) {
		super();
		this.message = message;
	}


	@Override
	public int hashCode() {
		return Objects.hash(message);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mammal other = (Mammal) obj;
		return Objects.equals(message, other.message);
	}


	public void setMessage(T message) {
		this.message = message;
	}


	@Override
	public String toString() {
		return "Mammal [message=" + message + "]";
	}
	
	
}
