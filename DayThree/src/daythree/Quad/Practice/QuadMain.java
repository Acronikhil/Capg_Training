package daythree.Quad.Practice;

public class QuadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------- Area Of Square ---------------");
		Square sq = new Square();
		sq.setBase(5);
		sq.setHeight(5);
		System.out.println(sq.area());
		
		System.out.println("-------------- Area Of Rectangle ---------------");
		Rectangle rect = new Rectangle();
		rect.setBase(5);
		rect.setHeight(5);
		System.out.println(rect.area());
		
		System.out.println("-------------- Area Of Paralellogram ---------------");
		Paralellogram p = new Paralellogram();
		p.setBase(5);
		p.setHeight(5);
		System.out.println(p.area());

	}

}
