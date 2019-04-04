package hashtable;

public class Student {
	
	public Student(String name,String roll_no, double cgpa) {
		
		this.name= name;
		this.rollno=roll_no;
		this.gpa=cgpa;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	private String name;
	private String rollno;
	private double gpa;
	
	public String toString() {
		
		return "Name: "+name+" Roll no: "+rollno+" cgpa: "+gpa;
	}
	
}
