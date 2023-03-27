package exception_demo;

// extends Exception for user defined exception
public class InvalidAgeException extends Exception{

	public InvalidAgeException(String s){
		super(s);
	}
}
