package dayfour.string.example;

public class StringModificationExample {

	// Added in java 5	
//	java.lang.StringBuffer and java.lang.StringBuilder allow modification to string
	
	
	public static void main(String[] args) {
		String x= "abc";
		x.concat("def");
		System.out.println("X= "+x);
		
		

		StringBuffer sb = new StringBuffer("fgh");
		sb.append("ijk");
		System.out.println("Sb= "+sb);
//		sb.insert(2, false);
//		sb.replace(3, 6, "Hello");
//		sb.reverse();
		System.out.println(sb.length());
		System.out.println(sb.capacity());// default capacity = 16 
		//new capacity more than default then: (oldcapacity*2)+2
		System.out.println(sb);
		
		
		// StringBuilder calss exactly same API as the StringBuffer class except:
		// It is not thread safe(not synchronized). It runs faster than StringBuffer.
		// --> StringBuilder methods are not synchronised.
		
//		StringBuilder sbu = new StringBuilder();
//		sbu.

	}

}
