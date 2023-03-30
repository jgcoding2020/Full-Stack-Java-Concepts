package functional_interfaces;

public class Student {
	int rollNum;
	int className;
	String name;
	
	public Student(int rollNum, int className, String name) {
		this.rollNum = rollNum;
		this.className = className;
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public int getClassName() {
		return className;
	}

	public void setClassName(int className) {
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
