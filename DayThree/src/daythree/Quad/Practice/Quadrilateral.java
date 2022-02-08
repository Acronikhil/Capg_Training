package daythree.Quad.Practice;

public abstract class Quadrilateral {

	Integer base;
	Integer height;
	
	public abstract int area();
	
	public Quadrilateral(Integer base, Integer height) {
		super();
		this.base = base;
		this.height = height;
	}
	public Quadrilateral() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Integer getBase() {
		return base;
	}
	public void setBase(Integer base) {
		this.base = base;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	
	
	
}
