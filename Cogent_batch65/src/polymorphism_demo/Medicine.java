package polymorphism_demo;

public class Medicine {
	
	String name;
	String address;
	
	public void displayLabel() {
		System.out.println(this.getName());
		System.out.println(this.getAddress());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
