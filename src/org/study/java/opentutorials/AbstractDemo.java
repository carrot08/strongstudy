package org.study.java.opentutorials;

abstract class C {
    public abstract int b();
    
    //public abstract int c() {return 1;};
    public int d() {return 3;}
}


class D extends C{
    public int b(){return 1;}
}
public class AbstractDemo {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.b());
        System.out.println(d.d());
    }
}
