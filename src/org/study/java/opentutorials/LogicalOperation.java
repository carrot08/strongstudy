package org.study.java.opentutorials;

public class LogicalOperation {
	public static void main(String[] args) {
		
		System.out.println(" == LogicalOperation == ");
 
		int a = 200;
		
		if(true && true) {
			System.out.println(true);
		}
		
		if(true && false) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}

		if(true || false) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}

		if(!true) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}

		if(!true && true) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
		if((!true || true) && true) {
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
}
