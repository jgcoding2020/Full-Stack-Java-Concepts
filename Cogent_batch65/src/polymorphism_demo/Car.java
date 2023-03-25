package polymorphism_demo;

public class Car {
	
	int speed;
	int noOfGears;
	
	public void drive(int speed, int noOfGears){
		this.speed = speed;
		this.noOfGears = noOfGears;
	}
	
	public void display(){
		System.out.println("Speed: " + getSpeed());
		System.out.println("Number of gears: " + getNoOfGears());
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNoOfGears() {
		return noOfGears;
	}

	public void setNoOfGears(int noOfGears) {
		this.noOfGears = noOfGears;
	}
	
	
}
