package lambda_expression;

public class LambdaTest {

	public static void main(String[] args) {
		MyInterface mi = (s) -> {
			return s.length();
			};
		System.out.println("Lambda expression output:");
		System.out.println(mi.len("james is awesome!"));
	}
}
