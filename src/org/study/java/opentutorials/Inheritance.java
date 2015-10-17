package org.study.java.opentutorials;

public class Inheritance {

	public static void main(String[] args) {
		Robot r = new Robot("carrot");
		r.talk();
		r.walk();
		
		FlyRobot f = new FlyRobot("carrot");
		f.talk();
		f.walk();
		f.fly();
		
		SwimRobot s = new SwimRobot("carrot");
		s.talk();
		s.walk();
		s.swim();
	}
}

class Robot {
	String name;
	public Robot(String name) {
		this.name = name;
	}
	public void talk() {
		System.out.println("�߸��߸� " + this.name +"�Դϴ�.");
	}
	public void walk() {
		System.out.println(this.name + " �ɾ� �ɾ�");
	}
}

class FlyRobot extends Robot{
	public FlyRobot(String name) {
		super(name);
	}
	public void fly() {
		System.out.println(this.name + " �Ĵ��Ĵ�");
	}
}

class SwimRobot extends Robot{
	public SwimRobot(String name) {
		super(name);
	}

	public void swim() {
		System.out.println(this.name + " ÷��÷��");
	}
}

