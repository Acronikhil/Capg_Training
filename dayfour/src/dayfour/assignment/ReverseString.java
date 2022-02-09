package dayfour.assignment;

public class ReverseString {

	public String str = "Hello";
	
	
	public void reverse() {
		char temp;
		char arr[] = str.toCharArray();
//		System.out.println(str.charAt(2));
		int length = arr.length-1;
		
		//swap
		for(int i=0 ; i <= length/2 ; i++) {
			temp = arr[i];
			arr[i] = arr[length - i];
			arr[length - i] = temp;	
		}
		String s = new String(arr);
		System.out.println("Reversed String: "+ s);
	}
	
	public void anotherReverse() {
		String newStr = "";
		char ch;
		for(int i=0 ; i < str.length() ; i++) {
			ch = str.charAt(i);
			newStr = ch+newStr;
		}
		System.out.println("Reversed String: "+ newStr);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString();
		rs.reverse();
		rs.anotherReverse();
		
		
		

	}

}
