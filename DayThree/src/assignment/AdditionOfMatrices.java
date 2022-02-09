package assignment;

import java.util.Scanner;

public class AdditionOfMatrices {
	
	private int size;
	private int arr[][];
	private int newArr[][];
	
	Scanner sc = new Scanner(System.in);
	
	public AdditionOfMatrices() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdditionOfMatrices(int size) {
		super();
		this.size = size;
		arr = new int[size][size];
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int[][] getArr() {
		return arr;
	}
	
	
	public void makeMatrix(int size) {
		
		this.size = size;
		arr = new int[size][size];
		newArr = new  int[size][size];
		
		System.out.println("Enter elements in Matrix");
		for(int i=0 ; i< size ; i++) {
			for(int j=0 ; j <size ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public void printMatrix() {
		for(int i=0 ; i< this.size; i++) {
			for(int j=0 ; j < size ; j++) {
				System.out.print(this.newArr[i][j]+" ");
			}System.out.println("");
		}
	}
	
	public int[][] sum(int arr1[][], int arr2[][], int size) {
		
		for(int i=0 ; i < size; i++ ) {
			for(int j=0 ; j < size ; j++) {
				newArr[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return newArr;
		
	}
	
	
	

}
