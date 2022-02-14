package daysix.assignment.swap;

import java.util.ArrayList;
import java.util.List;

public class SwapMain {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ArrayList l = new ArrayList();
//		l.add("Hello");
//		l.add("!");
//		l.add("Everyone");
		
		String arr[] = {"Hello", "Nikhil","I'm"};
//		Arrays a= new Arrays();
		
//		List a = new ArrayList();
//		a.add("Hello");
//		a.add("Im");
//		a.add("Nikhil");
//		a.add(20);
		

		
		System.out.println(arr[0]);
		
		
		
		GenericArray<String>  ga = new GenericArray<String>(arr);
		
		for(String x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		Swap.swap(ga.getArray(), 1, 2);
		for(String x : arr) {
			System.out.print(x+" ");
		}
	
		
		

	}

}
