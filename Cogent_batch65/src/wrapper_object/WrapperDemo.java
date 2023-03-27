package wrapper_object;

public class WrapperDemo {
	
	public static void main(String[] args){
		int x = 100;//primitive
		Integer y = Integer.valueOf(x);//boxing
		int z = y.intValue();//unboxing
		
		byte a = 100;
		String b = Byte.toString(a);
		byte c = Byte.parseByte(b);
		
		long d = 100;
		Long e = Long.valueOf(d);
		String f = e.toString();
		Long g = Long.valueOf(f);
		long h = g.parseLong(f);
	}

}
