package daythree.exceptions;

//User defined exception
public class AgeException extends Exception{
	
	private int age;
	AgeException(int a){
		age = a;
	}
	
	public String toString() {
		return age + " is an invalid age";
	}

}
