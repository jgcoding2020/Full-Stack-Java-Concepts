package cogent.infotech.com.lc;

public class Employee {

	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String toString() {
		return "Employee id = " + this.id;
	}
	public void init() {
		System.out.println("Init method has been called.");
	}
	public void destroy() {
		System.out.println("Destroy method has been called.");
	}
	
}
