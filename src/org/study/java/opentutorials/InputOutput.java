package org.study.java.opentutorials;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		 System.out.println(args.length);
		 
		 /*
		 Scanner sc = new Scanner(System.in);
		 int i = sc.nextInt();
		 System.out.println(i * 2);
		 sc.close();
		 */

		 /*
		 Scanner sc = new Scanner(System.in);
		 while(sc.hasNextInt()) {
	            System.out.println(sc.nextInt()* 2); 
	        }
		 sc.close();
		 */
		 try {
            File file = new File("out.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); 
            }
            sc.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }

	
	}

}
