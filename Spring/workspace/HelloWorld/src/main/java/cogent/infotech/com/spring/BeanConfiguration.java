package cogent.infotech.com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

	@Bean(name="person")
	public Person getPerson() {
		Person p = new Person();
		p.setId(1);
		p.setName("John");
		p.setAge(25);
		return p;
	}
	
	@Bean(name="product")
	public Product getProduct() {
		Product prod = new Product();
		prod.setpId(1);
		prod.setpName("brush");
		prod.setpPrice(5.00);
		return prod;
	}
}
