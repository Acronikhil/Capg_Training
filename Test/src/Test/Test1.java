package Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
//		int firstArray[] = { 99, 24 };
//		int secondArray[] = { 99, 24 };
//		if (firstArray == secondArray)
//			System.out.println("Same");
//		else
//			System.out.println("Not same");
//	

//		 try { badMethod(); 
//		 System.out.print("A"); 
//		 } catch (Exception ex) { System.out.print("B"); } finally { System.out.print("C"); } System.out.print("D"); }
//	
//public static void badMethod() {}

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.stream().map(i -> "Number " + i).forEach(s -> System.out.println(s));

	}
}