package doselect.thirdquestion;

public class Candidate {
	//Write Your Code Here..
	public String name;
    public int id;
    public int age;
    public String gender;
    public String department;
    public int yearOfJoining;
    public double salary;
    
    @Override
   public String toString() {
       return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
   }

}
