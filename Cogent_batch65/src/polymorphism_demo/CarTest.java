package polymorphism_demo;

public class CarTest {
	
	public static void main(String[] args){
		SportsCar viper = new SportsCar();
		
		viper.drive(65, 5);
		viper.setAirBalloonType("Inflation");
		viper.display();
	}
}
