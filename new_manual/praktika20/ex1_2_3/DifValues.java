package ex1_3;

import java.io.Serializable;

public class DifValues<T extends Comparable, V extends Serializable, K extends Substance> {
    private T first;
    private V second;
    private K third;
    DifValues(T first, V second, K third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public void printTypes(){
        System.out.println("Первый тип данных: " + first.getClass().getName() + ": " + first + "\n" +
                "Второй тип данных: " + second.getClass().getName() + ": " + second + "\n" +
                "Третий тип данных: " + third.getClass().getName() + ": " + third + "\n");
    }
    public static void main(String [] args){
        DifValues<String, Integer, Substance> ans = new DifValues<>("I am the walrus", 22, new Substance());
        ans.printTypes();
    }
}
