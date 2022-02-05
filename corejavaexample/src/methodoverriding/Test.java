package methodoverriding;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.parent();
		
		Parent p2 = new Child();
		p2.parent();
		
		
	}

}
