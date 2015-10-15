package org.study.java.opentutorials;

public class ClassMemberDemo {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.static_static();
		mem.static_instance();
		mem.instance_instance();
		mem.instance_static();
		
		
		Member.static_static();
		Member.static_instance();
	}
}
class Member {
	static int static_val = 1;
	int instance_val = 2;
	
	static void static_static() {
		System.out.println(static_val);
	}
	
	static void static_instance() {
		//System.out.println(instance_val);
	}
	
	void instance_static() {
		System.out.println(static_val);
	}
	
	void instance_instance() {
		System.out.println(instance_val);
	}
}