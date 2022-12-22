import java.util.Scanner;

public class Solution {
    public static int recursion(int n, int i) {
        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
        System.out.println("Тестирование задания 11");
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Палиндром данного числа: " + recursion(sc.nextInt(), 0));
    }
}