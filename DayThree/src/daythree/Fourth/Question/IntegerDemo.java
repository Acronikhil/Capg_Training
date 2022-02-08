package daythree.Fourth.Question;

public class IntegerDemo {
	
//	int[] arr;
//	int size;
//	IntegerDemo(int i){
//		size = i;
//		arr = new int[i];
//	}
	
	int arr[]= {9,8,7,6,5,4,3,2,1,0};
	
	
	public void display(int number, int position) {
		System.out.println("Number: "+number+" Index:"+position);
	}
	

	
	public void findNumber(int number) {
		for(int j=0; j <arr.length; j++ ) {
			if(arr[j] == number) {
				display(number, j);
			}
		}
	}

}
