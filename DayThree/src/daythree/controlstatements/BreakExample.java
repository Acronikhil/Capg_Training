package daythree.controlstatements;

public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		for( i=999; i< 999999; i++) {
			if (i%397 == 0) {
				break;
			}
		}
		System.out.println(i);
		
	}

}
