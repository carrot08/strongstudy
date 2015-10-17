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
		System.out.println("»ß¸®»ß¸® " + this.name +"ÀÔ´Ï´Ù.");
	}
	public void walk() {
		System.out.println(this.name + " °É¾î °É¾î");
	}
}

class FlyRobot extends Robot{
	public FlyRobot(String name) {
		super(name);
	}
	public void fly() {
		System.out.println(this.name + " ÆÄ´ÚÆÄ´Ú");
	}
}

class SwimRobot extends Robot{
	public SwimRobot(String name) {
		super(name);
	}

	public void swim() {
		System.out.println(this.name + " Ã·º¡Ã·º¡");
	}
}

