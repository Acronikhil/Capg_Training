package methodoverriding;

public class Child extends Parent {
	public void child() {
		System.out.println("IM CHILD");
	}
	
	@Override
	public void parent() {
		System.out.println("IM PARENT IN CHILD");
	}
}
