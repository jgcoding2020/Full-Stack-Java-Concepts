package esg.itp.shape;

public class Square implements Polygon{
	float side;
	
	public Square(float s){
		this.side = s;
	}

	public void calcArea() {
		float area = this.side * 2;
		System.out.println("Square area: " + area);
		
	}

	public void calcPeri() {
		float perimeter = side * 4;
		System.out.println("Square perimeter: " + perimeter);
		
	}

	public void display() {
		this.calcArea();
		this.calcPeri();
	}
}
