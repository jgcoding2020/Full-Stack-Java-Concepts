package polymorphism_demo;

public class Ointment extends Medicine{

	@Override
	public void displayLabel(){
		super.displayLabel();
		System.out.println("Store in cool dry place.");
	}
}
