package student_comparable;

public class Student implements Comparable<Student>{

	int rollNum;
	String name;
	
	public Student(int rollNum, String name){
		super();
		this.rollNum = rollNum;
		this.name = name;
	}
	
	@Override
	public int compareTo(Student s) {
		return this.getName().compareTo(s.getName());
	}
	
	public String toString(){
		return (this.getRollNum() + " " + this.getName());
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
