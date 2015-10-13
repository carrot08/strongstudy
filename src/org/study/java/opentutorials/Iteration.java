package org.study.java.opentutorials;

public class Iteration {

	public static void main(String[] args) {
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("====================");
		i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
			if(i == 9) break;
		}
		System.out.println("====================");
		i = 0;
		while(i < 10) {
			System.out.println(i);
			if(i == 9) break;
			i++;
		}
		System.out.println("====================");
		for(int a = 0; a < 10; a++) {
			System.out.println(a);
		}

		System.out.println("====================");
		for(int b = 0; b < 10; ++b) {
			System.out.println(b);
		}

		System.out.println("====================");
		for(int c = 0; c < 10; c++) {
			if(c == 2) continue;
			if(c == 5) break;
			System.out.println(c);
		}
		
		for(int aa = 0; aa < 10; aa++) {
			for(int bb = 0; bb < 5; bb++) {
				System.out.println(aa + " : " + bb);
			}
		}
		

	}

}
