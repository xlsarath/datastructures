package tree;

public class Person {
	
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public Person(String nm, int a) {
		name = nm;
		age = a;
		
	}
	
	public String toString() {
		return "\n >> Name: " +name+", Age: "+age;
		
	}

}
