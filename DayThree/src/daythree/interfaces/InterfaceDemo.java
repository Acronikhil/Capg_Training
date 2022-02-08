package daythree.interfaces;

public class InterfaceDemo implements InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemo d = new InterfaceDemo();
		d.displayMessage("ASHasca");
		d.methodA();
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("MTGOD A");
	}

	@Override
	public void displayMessage(String Message) {
		// TODO Auto-generated method stub
		System.out.println(Message);
	}

}
