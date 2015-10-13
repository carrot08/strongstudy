package org.study.java.opentutorials;

public class Array {

	public static void main(String[] args) {
		String[] arrName = {"당근","더스틴","자데","엠제이","밍","세라"};
		System.out.println(arrName.toString());
		
		String[] txt = new String[3];
		//txt[0] = 1;
		txt[0] = "0";
		System.out.println(txt.length);
		
		System.out.println("===================");
		for(int a = 0; a < txt.length; a++) {
			System.out.println(txt[a]);	
		}

	
		System.out.println("===================");
		for(String b : txt) {
			System.out.println(b);	
		}
		
		System.out.println("===================");
		int c = 0;
		while(txt[c] != null) {
			System.out.println(txt[c]);
			c++;
		}
		
		System.out.println("===================");
		txt[1] = "1";
		txt[2] = "2";
		//txt[3] = "3";
		//txt[4] = "4";
		System.out.println(String.join(",", txt));
		
		
		System.out.println("===================");
		String[] origin = {"1", "2", "3"};
		String[] clone = new String[origin.length];
		
		clone = origin.clone();
		for(String b : clone) {
			System.out.println(b);	
		}
		clone[0] = "4";
		for(int x = 0; x < origin.length; x++) {
			System.out.println(origin[x] + " : " + clone[x]);	
		}

	}

}
