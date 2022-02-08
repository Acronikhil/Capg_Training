package wrapper.classes;

public class WrapperClassesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer a =10;
		Integer b = new Integer(15);
		Integer c = Integer.valueOf(11);
		
		System.out.println(c);
		
//		Converting  premetive value into an object of the corresponding wrapper class is called AUTOBOXING
		
		float g =10.10f; //premitive value
		Float gg= Float.valueOf(g); //Autoboxing
		
		
		Integer i =100;
		int j=i;// Auto-Unboxing
		int k=j;// Autoboxing
		
		
		
		
		String s="1234";
		int p= Integer.parseInt(s);
		
	}

}
