package cogent.infotech.com.autowire.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowire/assignment/config.xml");
		Customer customer = (Customer)ctx.getBean("customer");
		
		Reservation reservation = customer.getReservation();
		
		System.out.println("Reservation id: " + reservation.getId());
		System.out.println("Reservation time: " + reservation.getTime());
		
	}

}
