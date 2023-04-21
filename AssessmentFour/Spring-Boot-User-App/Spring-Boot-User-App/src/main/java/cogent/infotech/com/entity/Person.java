package cogent.infotech.com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long personId;
	private String personName;
	private long personAge;
	private double personSalary;
	
	public Person() {
		
	}

	public Person(String personName, long personAge, double personSalary) {
		super();
		this.personName = personName;
		this.personAge = personAge;
		this.personSalary = personSalary;
	}

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getPersonAge() {
		return personAge;
	}

	public void setPersonAge(long personAge) {
		this.personAge = personAge;
	}

	public double getPersonSalary() {
		return personSalary;
	}

	public void setPersonSalary(double personSalary) {
		this.personSalary = personSalary;
	}
}
