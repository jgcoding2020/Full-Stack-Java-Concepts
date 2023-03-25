import gl.itp.hyd65.cs65.jgardn11.*;

public class GreeterTest {
	
	public static void main(String[] args){
		Greeter greeterMars = new Greeter(args[0]);
		Greeter greeterVenus = new Greeter(args[1]);
		Advisor advisor = new Advisor();
		greeterMars.sayHello();
		greeterVenus.sayHello();
		System.out.println("Advise: " + advisor.getAdvise().toString());
		greeterMars.sayGoodbye();
		greeterVenus.sayGoodbye();
	}
}
