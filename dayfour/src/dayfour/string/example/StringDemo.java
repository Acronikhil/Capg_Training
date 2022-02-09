package dayfour.string.example;

public class StringDemo {

	public static void main(String[] args) {
		char[] c = {'H','e','L','L','O'};
		String str = new String(c);// String is handled as an object of class string and not as an array of  characters
		String s = "Hello"; //s is referring to new object whose value is hello
		
		if("hello" instanceof String) {
			System.out.println(true);
		}
		
		s="Hi"; // s is now referring to new object whose value is "Hi"
		System.out.println(s);
	
	}
	
}