package org.study.java.chapter01;

public class Conditional {
	public static void main(String[] args) {
		
		System.out.println(" == Conditional == ");
 
		int a = 200;
		int b = 300;
		
		if(a == 200) {
			System.out.println(true);	
		}
		
		
		if(a == 200 || b ==300) {
			System.out.println(true);	
		}else {
			System.out.println(false);
		}
		b = 2;
		if(a == 200 || b ==300) {
			System.out.println(true);	
		}else {
			System.out.println(false);
		}
		
		
		b = 2;
		if(a == 200 && b ==300) {
			System.out.println(true);	
		}else {
			System.out.println(false);
		}
		
		switch(1) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		}
		
		/*
		 // javascript�� type error�� ����.
		switch(1.0) {
		case 1:
			System.out.println(1);
		case 2:
			System.out.println(2);
		}
		
		// javascript�� syntax error�� ����.
		int as =1;
		switch(1) {
		case as:
			System.out.println(1);
		case 2:
			System.out.println(2);
		}
		
		
		*/
		
		int as =1;
		switch(5) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("default");
		
		}

	}
}
