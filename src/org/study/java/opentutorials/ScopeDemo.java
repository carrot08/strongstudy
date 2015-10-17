package org.study.java.opentutorials;

public class ScopeDemo {
	
	public static void main(String[] args) {
		Scope1 s1 = new Scope1();
		s1.a();
		s1.b();
		s1.c();

		Scope1 s2 = new Scope1();
		s2.i = 30;
		s2.a();
		s2.b();
		s2.c();
	}
	
}

class Scope1 {
	int i = 0;
	
	public void a() {
		System.out.println(i);

		for(int i = 1; i < 5; i++) {
			System.out.println(i);
		}
	}
	
	public void b() {
		int i = 10;
		System.out.println(i);
	}
	
	public void c() {
		int i = 10;
		System.out.println(this.i);
	}

}
