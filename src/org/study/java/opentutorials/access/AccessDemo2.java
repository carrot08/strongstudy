package org.study.java.opentutorials.access;

class B {
    public String y() {
        return "public y";
    }
    
    protected String z() {
        return "private z";
    }
    
    public String x() {
        return z();
    }
}

public class AccessDemo2 {
    public static void main(String[] args) {
        B b = new B();
        b.z();
    }
    
    protected String demo() {
        return "AccessDemo2 demo";
    }
}
