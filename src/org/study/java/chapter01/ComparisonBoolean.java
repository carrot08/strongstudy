package org.study.java.chapter01;

public class ComparisonBoolean {
	public static void main(String[] args) {
		
		System.out.println(" == Comparison == ");
 
		int a = 200;
		
		System.out.println(" 1 == 2 "+ ( 1 == 2 ));
		System.out.println(" 1 != 2 "+ ( 1 != 2 ));
		System.out.println(" 1 > 2 "+ ( 1 > 2 ));
		System.out.println(" 1 < 2 "+ ( 1 < 2 ));
		System.out.println(" 1 >= 2 "+ ( 1 >= 2 ));
		System.out.println(" 1 <= 2 "+ ( 1 <= 2 ));
		
		System.out.println(" '1' == '1' "+ ( "1" == "1" ));
		//System.out.println(" '12' > '1' "+ ( "12" > "1" ));
		System.out.println(" '12'.equals'1' "+ ( "12".equals("1") ));
		System.out.println(" '1'.equals'1' "+ ( "1".equals("1") ));
		
		String b = "new";
		String c = new String("new");
		System.out.println(" b == c "+ ( b == c ));
		System.out.println(" b == c "+ ( b.equals(c) ));
		
	}
}
