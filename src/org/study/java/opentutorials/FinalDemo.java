package org.study.java.opentutorials;

class AA {
    static final String test = "X";
    public static final String test1 = "test1";
    private static final String test2 = "test2";
    public void setTest() {
        System.out.println("AA.test : " + AA.test);
        System.out.println("test : " + test);
        System.out.println("test1 : " + test1);
        System.out.println("test2 : " + test2);
    }
}
public class FinalDemo {
    public static void main(String[] args) {
        AA aa = new AA();
        
        System.out.println("AA test : " + aa.test);
        System.out.println("AA test1 : " + aa.test1);
        
    }
}
