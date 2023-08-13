package excercise_four;

public class Student {
	
	private int rollNo;
	private String name;
	private String address;
	private String email;
	
	public Student(int rollNo, String name, String address, String email) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
		this.email = email;
	}
	
	public void displayDetails() {
		System.out.println("Employee information: ");
		System.out.println("Id :" + this.rollNo);
		System.out.println("Name :" + this.name);
		System.out.println("Address :" + this.address);
		System.out.println("Email :" + this.email + "\n");
	}
}
