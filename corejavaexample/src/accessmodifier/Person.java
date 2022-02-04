package accessmodifier;

public class Person {
/*
 * Access Modifiers:- default, private, public, protected
 * 
 * private- fields (or properties or attributes ), methods or constructors declared private canot be accessed outside an enclosing class.
 * 
 * protected- can be accessed only in child class in other packages
 * 
 * default - within same package
 * 
 * */	
	
	private String firstName;
	private String lastName;
	protected String address;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int age;
	long mobileNo;
	
	
}
