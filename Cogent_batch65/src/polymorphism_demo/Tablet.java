package polymorphism_demo;

public class Tablet extends Medicine{

	@Override
	public void displayLabel(){
		super.displayLabel();
		System.out.println("Take 1 tablet 3 times daily.");
	}
}
