package dayfour.assignment;

public class FirstQuestion {
	
	String str = "Hello123".toUpperCase();
	char cArray[] = str.toCharArray();
	
	public boolean containsStringOnly() {
		boolean pureString;
		for(int i= 0 ; i <cArray.length; i++ ) {
			if( cArray[i] >=48 && cArray[i] <=57 ) {
				pureString = false;
			}
		}
		
		return true;
		
	}
	
	
	public void check() {
		if(containsBoth()) {
			System.out.println("It Countains String as well as Integer.");
		}
		else if (containsIntOnly()) {
			System.out.println("It Countains Integer Only.");
		}
		else if (containsStringOnly()) {
			System.out.println("It Countains String only.");
		}
	}
	
	
	public boolean containsIntOnly() {
		boolean pureInt;
		for(int i= 0 ; i <cArray.length; i++ ) {
			if( cArray[i] >=48 && cArray[i] <=57 ) {
				pureInt = true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public boolean containsBoth() {
		boolean pureInt = true;
		boolean pureString = true;
		
		for(int i= 0 ; i <cArray.length; i++ ) {
			if( cArray[i] >=48 && cArray[i] <=57 ) {
				pureString = false;
			}
			else if (cArray[i] >=65 && cArray[i] <= 90) {
				pureInt = false;
			}
		}
		
		if(pureInt== false && pureString == false ) {
			return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstQuestion fq = new FirstQuestion();
		fq.check();
		
//		String c = 7;
//		System.out.println(c);
		
				
	}

}
