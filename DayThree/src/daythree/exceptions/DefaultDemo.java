package daythree.exceptions;

public class DefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		String str = null;
		str.equals("Hello");
		}catch(NullPointerException npe) {
			npe.printStackTrace();
		}
		 System.out.println("COMPLETED");
	}

}
