package dayfour.string.example;

public class StringOperations {

	public static void main(String[] args) {
		
		String str = "Core";// new String("Core") -> that means new object will be created in String pool in memory
		String s = "Core";
		
		System.out.println(s.hashCode());
		System.out.println(str.hashCode());
		
		s=s.replace('C', 'B');
		System.out.println(s.hashCode());
		System.out.println("S: "+s);
		
		String s3 = s.replace('o', 'l');
		System.out.println(s.hashCode());
		System.out.println(s+ "\n"+ s3);
		

	}

}
