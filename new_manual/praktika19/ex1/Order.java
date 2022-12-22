package ex1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Order {
    private static final Pattern innPatter = Pattern.compile("\\d{10}|\\d{12}");
    public static boolean isCorrectINN(String inn) {
        inn = inn.trim();
        return innPatter.matcher(inn).matches();
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scan.next();
        System.out.println("Введите ИНН пользователя: ");
        String inn = scan.next();
        try {
            boolean ans = isValidINN(inn);
            if (ans)
                System.out.println("Введенный ИНН верный, покупка прошла успешно");
            else throw new ArithmeticException();
        }
        catch(ArithmeticException ignored){
            System.out.println("Вы ввели неправильный ИНН");
        }
    }
}
