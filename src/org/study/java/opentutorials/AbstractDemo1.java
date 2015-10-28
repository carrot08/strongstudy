package org.study.java.opentutorials;

abstract class AbstractCalculator {
    public abstract void sum(int val1, int val2); 
    public abstract void avg(int val1, int val2);
    public void run(int val1, int val2){
        sum(val1, val2);
        avg(val1, val2);
    }
}

class CalculatorDecoPlus extends AbstractCalculator{
    public void sum(int val1, int val2) {
        System.out.println("+sum = " + (val1 + val2));
    }; 
    public void avg(int val1, int val2) {
        System.out.println("+avg = " + (val1 + val2));
    };
}

class CalculatorDecoMinus extends AbstractCalculator{
    public void sum(int val1, int val2) {
        System.out.println("-sum = " + (val1 + val2));
    }; 
    public void avg(int val1, int val2) {
        System.out.println("-avg = " + (val1 + val2));
    };
}
public class AbstractDemo1 {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.run(10, 20);
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.run(10, 20);
    }    
}
