package polymorphism_demo;

public class SportsCar extends Car{
	
	String airBalloonType;
	
	@Override
	public void display(){
		super.display();
		System.out.println("Air ballon type: " + this.getAirBalloonType());
	}
	
	public String getAirBalloonType() {
		return airBalloonType;
	}
	
	public void setAirBalloonType(String airBalloonType) {
		this.airBalloonType = airBalloonType;
	}
}
