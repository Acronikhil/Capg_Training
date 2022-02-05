package inheritance;
//Derived class is inheriting the Base using extends keyword 
public class Derived extends Base {
	public void derivedMethod() {
//		Using super keyword we can access methods of Super/Parent class
		super.baseMethod();
		
		System.out.println("Derived");
	}
	public void baseMethod() {
		System.out.println("CHAnGED");
	}
}
