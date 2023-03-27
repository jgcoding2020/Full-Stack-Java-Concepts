package exception_demo;

//demonstrates try catch null pointer exception
public class ErrorDemo {
	
	public void message(){
		System.out.println("Happy Birthday!");
	}

	public static void main(String[] args){
		
		ErrorDemo demo1 = new ErrorDemo();
		demo1.message();
		
		ErrorDemo demo2 = null;
		
		try {
			//null pointer exception 
			demo2.message();
		} catch(NullPointerException e){
			System.out.println("Object is pointing to null");
		}
		
		//will not occur after exception unless handled
		System.out.println("this is message after the exception");
	}
}
