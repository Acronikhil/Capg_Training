package Test;

public class Greet {
	
	 public static String greetingMessage(String s)
	 {
		 String[] aArr = s.split("@");
		 
		 for(String s2: aArr) {
			 System.out.println(s2);
		 }
		 
//		 System.out.println(aArr);
		 
		 return " ";
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		greetingMessage("20.nikhildubye@gmail.com");
//		System.out.println( Greet.greetingMessage("20.nikhildubye@gmail.com"));
		
	}

}
