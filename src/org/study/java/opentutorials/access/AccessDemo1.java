package org.study.java.opentutorials.access;

class A {
    public String y() {
        return "public y";
    }
    
    private String z() {
        return "private z";
    }
    
    public String x() {
        return z();
    }
}

public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.x();
        //a.z();
        a.y();
        
        B b = new B();
        b.z();
    }
}
