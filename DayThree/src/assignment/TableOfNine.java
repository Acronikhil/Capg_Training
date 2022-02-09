package assignment;

public class TableOfNine {
	
	private int number;

	public TableOfNine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableOfNine(int number) {
		super();
		this.number = number;
		table(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void table(int number) {
		int cont;
		for(int x = 1 ; x <= 10; x++) {
			
			cont = number * x;
			System.out.println(number+" X "+x+" = "+cont);
		}
	}

}
