import java.util.Scanner;
public class IOS {
    public static void Main(String[] args){
        // Scanner in = new Scanner(System.in);
        Substance arr[] = {new Substance("Earth"), new Substance("Mars"),
                new Substance("horse")};
        for (int i = 0; i < 3; i++){
            System.out.println("Substance" + (i + 1) + ": " + arr[i].getName());
        }
    }
}
