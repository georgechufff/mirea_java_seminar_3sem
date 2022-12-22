import java.util.Scanner;
import java.util.regex.Pattern;

public class IP {
    public static void main(String[] args) {
        String reg = "^((25[0-5]|(2[0-4]|1\\d|[1-9]|)\\d)\\.?\\b){4}$";
        System.out.print("Введите адрес в формате IP: ");
        Scanner sc = new Scanner(System.in);
        String ip_address = sc.next();
        if (Pattern.matches(reg, ip_address))
            System.out.println("Корректный IP-адрес");
        else System.out.println("Некорректный IP-адрес");
    }
}