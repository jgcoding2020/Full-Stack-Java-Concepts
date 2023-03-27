package exception_demo;

public class MethodThrowsExceptionDemo {

	public void division(int x, int y)throws ArithmeticException{
		int z = x/y;
		System.out.println(z);
	}
	
	public static void main(String[] args){
		
		try{
			new MethodThrowsExceptionDemo().division(500, 0);
		} catch (ArithmeticException e){
			System.out.println("handled exception");
			e.printStackTrace();
		} finally {
			System.out.println("after exception");
		}
	}
}
