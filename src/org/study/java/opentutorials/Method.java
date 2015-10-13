package org.study.java.opentutorials;

public class Method {

	public static void main(String[] args) {

		String[] test = {"1","2","3"};
		String number1 = getJoinString(test, ":");
		System.out.println(number1);
		//String number2 = getJoinString({"1","2","3"}, ":");
		
		numbering(5);
		System.out.println("numbering_1=" + numbering_1(10,3));
		System.out.println("numbering_2=" + numbering_2(10,3));
	}
	
	public static void numbering(int limit) {
		for(int i = 0; i < limit; i++) {
			System.out.println(i);
		}
	}


	public static int numbering_1(int limit, int result) {
		int i = 0;
		for(i = 0; i < limit; i++) {
			if(i == result) break;
		}
		return i;
	}

	public static int numbering_2(int limit, int result) {
		int i = 0;
		for(i = 0; i < limit; i++) {
			if(i == result) return i;
		}
		return i;
	}
	
	
	public static String getJoinString(String[] list, String delimeter) {
		return String.join(delimeter, list);
	}


}
