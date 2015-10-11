package org.study.java.chapter01;

public class Operater {
	public static void main(String[] args) {
		int a = 1+2;
		
		System.out.println(a);
		
		a = a -1;
		System.out.println(a);
		
		a = a * 4;
		System.out.println(a);
		
		a = a / 4;
		System.out.println(a);
		
		a = a % 4;
		System.out.println(a);
		
		
		int b = 3;
		System.out.println("=====" +b+"====");
		System.out.println(0%b);
		System.out.println(1%b);
		System.out.println(2%b);
		System.out.println(3%b);
		System.out.println(4%b);
		System.out.println(5%b);

		int c = 6;
		System.out.println("====="+c+"====");
		System.out.println(0%c);
		System.out.println(1%c);
		System.out.println(2%c);
		System.out.println(3%c);
		System.out.println(4%c);
		System.out.println(5%c);
		
		int d = 1;
		int e = 2;
		System.out.println(d+e);
		System.out.println(d/e);
		
		int f = 0x7fFFFFFF;
		System.out.println(f);
		System.out.println(f * f);
		
		float g= 0x7fFFFFFF;
		System.out.println(f * g);
		System.out.println((double)f * g);
	}
}
