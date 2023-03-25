package esg.itp.shape;

public class Rectangle implements Polygon{
	float length;
	float breadth;
	
	public Rectangle(float len, float bre){
		this.length = len;
		this.breadth = bre;
	}

	public void calcArea() {
		float area = this.length * this.breadth;
		System.out.println("Rectangle area: " + area);
		
	}

	public void calcPeri() {
		float perimeter = (this.length * 2) + (this.breadth * 2);
		System.out.println("Rectangle perimeter: " + perimeter);
		
	}

	public void display() {
		this.calcArea();
		this.calcPeri();
	}
}
