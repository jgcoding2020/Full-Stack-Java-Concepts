package polymorphism_demo;

public class Syrup extends Medicine{

	@Override
	public void displayLabel(){
		super.displayLabel();
		System.out.println("Fill syrup to full line.");
	}
}
