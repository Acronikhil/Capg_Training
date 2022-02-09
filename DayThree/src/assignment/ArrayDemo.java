package assignment;

public class ArrayDemo {
	static int arr[]= {1,2,3,4,5,6,7,8,9,10};
	
	public static void evenNumbers() {
		for(int x: arr) {
			if(x%2==0) {
				System.out.println(x);
			}
		}
	}
	
}
