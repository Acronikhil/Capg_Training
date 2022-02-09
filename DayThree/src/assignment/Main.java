package assignment;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Even Numbers form array
//		ArrayDemo.evenNumbers();

		// Number Till 20
//		IntegerTill20.print();
		
		// Addition of Matrix
		
		
		AdditionOfMatrices matrix1 = new AdditionOfMatrices();
		AdditionOfMatrices matrix2 = new AdditionOfMatrices();
		
		System.out.println("Enter the size of matrix1");
		matrix1.makeMatrix(sc.nextInt());
		System.out.println("Enter the size of matrix2");
		matrix2.makeMatrix(sc.nextInt());
		
		
		matrix1.sum(matrix1.getArr(), matrix2.getArr(), matrix1.getSize());
		matrix1.printMatrix();
		
		
		
		
		
		
	}

}
