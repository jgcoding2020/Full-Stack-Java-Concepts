package Rectangle;

public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(){
		this.length = 0;
		this.breadth = 0;
	}
	
	public Rectangle(int len, int bre){
		this.length = len;
		this.breadth = bre;
	}
	
	public void calcArea(){
		int area = getLength() * getBreadth();
		System.out.println("Rectangle area: " + area);
	}
	
	public void display(){
		this.calcArea();
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	
}
