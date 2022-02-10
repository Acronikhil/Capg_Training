package daythree.Fourth.Question;

import java.util.Scanner;

public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int search;
		
		IntegerDemo in = new IntegerDemo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Element to search in array");
		search = sc.nextInt();
		
		sc.close();
		in.findNumber(search);
		
		
		

	}

}
