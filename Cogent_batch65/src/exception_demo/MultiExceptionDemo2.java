package exception_demo;

//demonstrates handling multiple Exception e with single catch block
//using e.printStackTrace()
public class MultiExceptionDemo2 {

	public static void main(String[] args){
		
		try {
			String input = args[0];
			System.out.println("input is: " + input);
			int output = Integer.parseInt(input);
			System.out.println("output is:" + output);
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			System.out.println("This is finally block!!!");
		}
		System.out.println("This is after try/catch exception handling");
	}
}