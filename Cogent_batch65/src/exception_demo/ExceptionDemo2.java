package exception_demo;

//demonstrates try/catch array index out of bounds exception
public class ExceptionDemo2 {

	public static void main(String[] args){
		String[] names = {"James", "Joe", "Janet"};
		try {
			//array index out of bounds exception
			System.out.println(names[10]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Can't access index out of array element range");
		}
		
		//does not occur after exception unless handled
		System.out.println("after exception");
	}
}
