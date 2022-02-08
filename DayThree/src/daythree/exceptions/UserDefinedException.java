package daythree.exceptions;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		
		
		try {
			if(age< 18) {
				throw new AgeException(age);
				
			}
		}catch(AgeException ae) {
			ae.printStackTrace();
		}
	}

}
