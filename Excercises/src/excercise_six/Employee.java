package excercise_six;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private int age;
	private String email;
	private static int count = 1;
	
	public Employee() {
		this.id = count++;
	}
	
	public Employee(String name, String department, int age, String email) {
		this.name = name;
		this.department = department;
		this.age = age;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void displayDetails() {
		System.out.println("Employee information: ");
		System.out.println("Id: " + this.id);
		System.out.println("Department: " + this.department);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Email: " + this.email + "\n");
	}
}
