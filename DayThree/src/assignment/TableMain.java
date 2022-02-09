package assignment;

import java.util.Scanner;

public class TableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Table: ");
		num = sc.nextInt();
		
		TableOfNine table = new TableOfNine(num);
		

	}

}
