public class Solution {
    public static void recursion() {

        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n + " - нечетное число!");
                recursion();
            } else {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Тестирование задания 12");
        recursion();
    }
}
