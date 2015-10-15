package org.study.java.opentutorials;

import java.util.Scanner;

public class CaculatorDemo {

	static Scanner sc = new Scanner(System.in);
	static Caculator cacul = new Caculator();
	
	static int result = 0;
	public static void main(String[] args) {
		scanner();
	}
	
	public static void scanner() {
		 while(sc.hasNextLine()) {
			 String val = sc.nextLine();
			 int old = result;
			 if(val.equals("+")) {
				 String val1 = sc.nextLine();
				 result = cacul.sum(old, Integer.parseInt(val1));
				 System.out.println("result : " + old + " + " + val1 +" = " + result); 
			 }else {
				 result = Integer.parseInt(val);
			 }
	     }
		 sc.close();
	}
}

class Caculator {
	public int sum(int left, int right) {
		return left + right;
	}
	
	public int avg(int left, int right) {
		return left / right;
	}
}
