package student_comparator;

public class Student{

	int rollNum;
	String name;
	
	public Student(int rollNum, String name){
		this.rollNum = rollNum;
		this.name = name;
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