package wrapper_object;

public class WrapUnwrapPrimitives {
	
	public static void main(String[] args){
		byte b = 1;
		Byte byteObj = Byte.valueOf(b);// boxing byte to Byte
		byte b1 = byteObj.byteValue();// unboxing Byte to byte 
		
		short s = 2;
		Short shortObj = Short.valueOf(s);// boxing short to Short
		short s1 = shortObj.shortValue();// unboxing
		
		int i = 3;
		Integer intObj = Integer.valueOf(i);// boxing int to Integer
		int i1 = intObj.intValue();// unboxing Integer
		
		long l = 4;
		Long longObj = Long.valueOf(l);// boxing long to Long
		long l1 = longObj.longValue();// unboxing Long
		
		float f = 1.0f;
		Float floatObj = Float.valueOf(f);// boxing float to Float
		float f1 = floatObj.floatValue();// unboxing Float
		
		double d = 2.0;
		Double doubleObj = Double.valueOf(d);// boxing double to Double
		double d1 = doubleObj.doubleValue();// unboxing Double
		
		char c = 'a';
		Character charObj = Character.valueOf(c);// boxing char to Character
		char c1 = charObj.charValue();// unboxing Character
		
		boolean bool = true;
		Boolean booleanObj = Boolean.valueOf(bool);// boxing boolean to Boolean
		boolean bool1 = booleanObj.booleanValue();// unboxing Boolean
	}

}
