import java.util.Scanner;

public class exc2 {
    public static void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Введите целое число: ");
        String intString = myScanner.next();
        Boolean has_error = false;
        try{
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch ( NumberFormatException aborted){
            System.out.println("Это не число!");
            has_error = true;
        }
        catch (ArithmeticException aborted){
            System.out.println("На ноль делить нельзя!");
            has_error = true;
        }
        finally {
            System.out.print("Программа завершила свою работу");
            if (has_error){
                System.out.println(" и обработала 1 исключение");
            }
            else
                System.out.println(", ни одно исключение не было вызвано");
        }
    }

    public static void main(String [] args){
        exceptionDemo();
    }
}