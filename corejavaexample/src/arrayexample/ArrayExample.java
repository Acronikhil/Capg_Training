package arrayexample;



public class ArrayExample {
	public static void main(String args[]) {
		int num =15;
//		System.out.println(num);
		
//		Array is colle
//		int arr[]= null;
		int arr[];
		arr = new int[10];// initialized an array ot integer to store 10 elements
		
		int arr2[] = {1,2,3,5,4,6,8,9,7,5};
		int arr3[] = {1,2,3,5,4,6,8,9,7,5};
//	
		System.out.println(arr2[0]);
//		System.out.println(arr);
//		System.out.println(arr.length);
//		int arr3[] = arr2.clone();
		
		System.out.println(arr3.equals(arr2));
		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr3[i]);
//		}
		
//		for each loop
//		for each element in array do execute the statement inside the curly braces

		for (int i : arr3) {
			System.out.println(i);
		}
	}

}
