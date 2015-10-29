package org.study.java.opentutorials;

interface Bird {
    public void eat();
    public void fly();
}
interface Fish {
    public void eat();
    public void swim();
}

class Urobot implements Bird, Fish {

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
    
}

public class InterfaceDemo {

}
