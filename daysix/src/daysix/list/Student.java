package daysix.list;

public class Student implements Comparable {
	
	private Integer studentId;
	private String studentName;
	private Double marks;
	
	public Student(Integer studentId, String studentName, Double marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Object o) {
		if(this.marks == ((Student)o).marks) {
			return 0;
		}else if (this.marks > ((Student)o).marks) {
			return 1;
			
		}
		else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}

}
