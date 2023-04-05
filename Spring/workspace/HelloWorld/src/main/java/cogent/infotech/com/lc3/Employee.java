package cogent.infotech.com.lc3;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{

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
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("After properties set");
		
	}
	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Inside destroy");
		
	}
}
