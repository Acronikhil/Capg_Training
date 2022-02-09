package dayfour.string.example;

public class StringComparision {
	
//In java we can compare String on the basis of content and reference
	// By using equals() Method
	// By using == operator
	// By using compareTo() method --- we mainly use in sorting
	
	public static void main(String[] args) {
		String str = "Hello";
		String s = "Hello";
		String s1 = new String("Hello"); // str== s1 -> false
//		String s1 = new String(str); // str== s1 -> false
//		String s1 = "Hello";// str == s1 -> true
		
//		System.out.println(s==str); // Compares refrences not value
//		System.out.println(s.equals(str)); //Compares values of string of equality
		
		//Example
		System.out.println(str==s1);
		System.out.println(str.equals(s1));
		
		/*
		 * if two objects are equal according to equals() method, 
		 * then calling the hashcode() on each of the two objects must produce the same integer result
		 * 
		 * */
		
		
		System.out.println(str.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(Integer.toHexString(System.identityHashCode(str)));
	    System.out.println(Integer.toHexString(System.identityHashCode(s1)));
	    
//		toString() -> this mewthod must be written in class to represent the object output 
		
		
	}
}
