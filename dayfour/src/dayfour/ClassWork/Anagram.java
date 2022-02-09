package dayfour.ClassWork;

import java.util.Arrays;

public class Anagram {

	String str1= "Parliament".toLowerCase().replace(" ", "");
	String str2= "Partial men".toLowerCase().replace(" ", "");
	
	char ch1[] = str1.toCharArray();
	char ch2[] = str2.toCharArray();
	
	
	
	public void print() {
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		str1 = String.valueOf(ch1);
		str2 = String.valueOf(ch2);
		
//		System.out.println(str1 == str2);
//		System.out.println(str1.equals(str2));
		
		if(str1.equals(str2)) {
			System.out.println("Is Anagram");
		}
		else {
			System.out.println("Is not Anagram");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anagram an = new Anagram();
		an.print();
	}

}
