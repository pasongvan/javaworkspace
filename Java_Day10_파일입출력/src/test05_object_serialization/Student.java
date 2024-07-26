package test05_object_serialization;

public class Student extends Person {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [major=" + major + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	

}
