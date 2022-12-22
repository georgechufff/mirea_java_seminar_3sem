public class Solution {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.print("Введите число: ");
        int n = in.nextInt();
        // Базовый случай
        if (n > 0) {
            int m = in.nextInt();
            System.out.println("Число " + n + " имеет четный индекс");
            // Базовый случай
            if (m > 0) {
                // Шаг рекурсии / рекурсивное условие
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Тестирование задания 13");
        recursion(); // вызов рекурсивной функции
    }
}