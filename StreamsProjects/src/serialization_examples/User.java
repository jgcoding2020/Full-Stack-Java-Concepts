package serialization_examples;

import java.io.Serializable;

public class User implements Serializable {

	int rollNum;
	String name;
	int age;
	String address;
	

	public User(int rollNum, String name, int age, String address) throws BlankFieldException{
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.address = address;
		if (this.rollNum == 0 || this.name == null || this.age == 0 || this.address == null)
			throw new BlankFieldException("No blank fields allowed.");
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
