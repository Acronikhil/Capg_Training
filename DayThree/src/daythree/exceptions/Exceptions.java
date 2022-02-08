package daythree.exceptions;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =15;
		int result = 0;
//		result = i/3;
		
		try {
		result = i/0;// Disivion by zero
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}finally {
			System.out.println("I am inside finally block");
		}
		
		System.out.println("Disvision completed, result is ---------"+ result);

		System.out.println(divide(15,0));
		
	}
	
	
	public static int divide(int x , int y) {
		int ans = 0 ;
		try {
			ans = x/y;
		}catch(Exception e) {
			ans=0;
		}finally {
			return ans; //This is always excepted
		}
	}

}
