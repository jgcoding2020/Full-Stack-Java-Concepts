package exception_demo;

//demonstrates try/catch with multiple possible exceptions
public class MultiExceptionDemo {

	public static void main(String[] args){
		
		try {
			String input = args[0];
			System.out.println("input is:" + input);
			int output = Integer.parseInt(input);
			System.out.println("output is:" + output);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds exception");
		} catch (NumberFormatException e){
			System.out.println("Number format exception");
		}
	}
}
