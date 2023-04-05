package cogent.infotech.com.assignment;

import org.springframework.beans.factory.annotation.Required;

public class University {

	private int id;
	private String name;
	private String location;
	public int getId() {
		return id;
	}
	@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	@Required
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "University: [id= " + id + ", name= " + name + ", location= " + location + "]";
	}
	
	
}
