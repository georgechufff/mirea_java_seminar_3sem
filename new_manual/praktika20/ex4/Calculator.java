package ex4;

public class Calculator {
    public static <T extends Number, V extends Number> void sum(T first, V second){
        System.out.println(first.doubleValue() + second.doubleValue());
    }
    public static <T extends Number, V extends Number> void multiply(T first, V second){
        System.out.println(first.doubleValue() * second.doubleValue());
    }
    public static <T extends Number, V extends Number> void divide(T first, V second){
        System.out.println(first.doubleValue() / second.doubleValue());
    }
    public static <T extends Number, V extends Number> void subtraction(T first, V second){
        System.out.println(first.doubleValue() - second.doubleValue());
    }

    public static void main(String [] args){
        Integer first = 5;
        Double second = 5.3;
        System.out.println(first + second);
        Calculator.sum(first, second);
        Calculator.multiply(first, second);
        Calculator.divide(first, second);
        Calculator.subtraction(first, second);
    }
}