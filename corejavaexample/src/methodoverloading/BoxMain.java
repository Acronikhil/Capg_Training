package methodoverloading;

public class BoxMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box boxObj1 = new Box();// calls constructor 1 
		Box boxObj2 = new Box(30.50); // calls constructor 2
		boxObj1.calculateVolume(15.0);
		boxObj1.calculateVolume(15);
		boxObj1.calculateVolume(1, 2, 3);
		boxObj1.calculateVolume(1, 2.2, 3);
		boxObj2.calculateVolume(2);

	}

}
