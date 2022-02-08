package daythree.arrays;

public class ArrayDemo {
	
	int[] arr;
	int inp;
	
	ArrayDemo(int i){
		inp = i;
		arr = new int[i];
	}
	
	public void addData() {
		for(int i=1; i<inp;i++) {
			arr[i]=i;
		}
	}
	
	public void getData() {
		for(int x: arr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
//		String arr [] = {"hello","Nikhil", "Dubey", "How", "Are", "You"};
//		
//		for(String x :arr) {
//			System.out.println(x);
//		}
		System.out.println(args[0]);
		int para = Integer.parseInt(args[0]);
		ArrayDemo ad = new ArrayDemo(para);
		System.out.println("-------------Beore inesrting data ---------------");
		ad.getData();
		System.out.println("-------------After inserting data ---------------");
		ad.addData();
		ad.getData();
		
		
		
	}
}
