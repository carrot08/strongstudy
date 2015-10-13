package org.study.java.opentutorials;

public class TypeConversion {
	public static void main(String[] args) {
		int a = 200;
		
		System.out.println(Integer.toBinaryString(a));
 
		float b = 200.0f;
		
		System.out.println(b);
		System.out.println(Float.floatToIntBits(b));
		
		double c = 200.0;
		System.out.println(c);
		
		
		float d = (float)200.0;
		System.out.println(d);
		
		
		
	}
}
