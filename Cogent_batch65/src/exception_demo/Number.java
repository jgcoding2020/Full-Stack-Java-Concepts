package exception_demo;

public class Number {
	int x;
	int y;
	double result;
	
	public Number(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void add(){
		this.result = this.x + this.y;
		System.out.println("Addition = " + this.getResult());
	}
	
	public void sub(){
		this.result = this.x - this.y;
		System.out.println("Subtraction = " + this.getResult());
	}
	public void mul(){
		this.result = this.x * this.y;
		System.out.println("Multiplication = " + this.getResult());
	}
	public void div() throws ArithmeticException{
		if (this.y == 0)
			throw new ArithmeticException();
		else {
			this.result = this.x / (double)this.y;
		System.out.println("Division = " + this.getResult());
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}
	
	
}
