import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Convertation conv = new Convertation();
        System.out.println(conv.convert(0, "F") + " F");
        System.out.println(conv.convert(3, "F") + " F");
        System.out.println(conv.convert(0, "K") + " K");
        System.out.println(conv.convert(30, "K") + " K");
    }
}
