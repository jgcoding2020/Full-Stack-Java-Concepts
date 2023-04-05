package cogent.infotech.com.autowire.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private String name;
	private Reservation reservation;
	public String getName() {
		return name;
	}
	
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReservation() {
		return reservation;
	}
	@Autowired
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
}
