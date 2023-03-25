package gl.itp.hyd65.cs65.jgardn11;

public class Greeter {
	
	String name;
	
	public Greeter(String aName){
		this.name = aName;
	}
	
	public void sayHello(){
		System.out.println("Hello, " + this.name);
	}
	
	public void sayGoodbye(){
		System.out.println("Goodbye, " + this.name);
	}

}
