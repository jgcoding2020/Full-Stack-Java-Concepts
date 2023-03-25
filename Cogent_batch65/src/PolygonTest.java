import esg.itp.shape.*;

public class PolygonTest {
	
	public static void main(String[] args){
		Polygon square = new Square(2.0f);
		Polygon rectangle = new Rectangle(2.0f, 3.0f);
		square.display();
		rectangle.display();
	}
}
