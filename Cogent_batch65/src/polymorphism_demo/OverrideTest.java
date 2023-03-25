package polymorphism_demo;

public class OverrideTest {
public static void main(String[] args){
		
		Person p = new Child();
		p.behavior();
		p = new Parent();
		p.behavior();
		p = new Colleague();
		p.behavior();
		p = new Wife();
		p.behavior();	
	}
}
