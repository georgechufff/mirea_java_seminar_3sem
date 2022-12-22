import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Tester {
    public Tester() {
    }

    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> ans = new ArrayList<>(10);
        for (int i = 0; i < 10; i++)
            ans.add(i, i + 1);
        return ans;
    }

    public static LinkedList<Integer> createLinkedList(){
        LinkedList<Integer> ans = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            ans.add(i + 1);
        return ans;
    }

    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задание 1");
        Date dateBegin = new Date(122, 11, 23, 12, 40); // set(year + 1900, month, date, hrs, min)
        Date dateEnd = new Date();
        System.out.print("Дата получения работы: " + dateBegin.toString()
                + "\nДата завершения работы: " + dateEnd.toString() + "\n");

        System.out.println("\nЗадание 2");
        System.out.print("Введите дату (в таком формате 2017-9-11): ");
        String stringDate = scan.next();
        Date personDate = (new SimpleDateFormat("y-M-d")).parse(stringDate);
        Date now = new Date();

        if (now.getTime() - personDate.getTime() < 86400000 && now.getTime() - personDate.getTime() > 0)
            System.out.print("Введенные данные совпадают\n");
        else if (now.getTime() - personDate.getTime() > 86400000)
            System.out.print("Эта дата была в прошлом\n");
        else System.out.print("Эта дата будет в будущем\n");

        System.out.println("\nЗадание 3");
        System.out.print("Введите имя пользователя: ");
        String name = scan.next();
        System.out.print("Введите дату рождения в том же самом формате: ");
        String birthDay = scan.next();
        Date birthDate = (new SimpleDateFormat("y-M-d")).parse(birthDay);
        Student st = new Student(name, birthDate);
        System.out.println(st.toString(1));

        System.out.println("\nЗадание 4");
        Calendar calendar = new Calendar();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Введите данные в том же самом формате: ");
            String date = scan.next();
            calendar.add_date(date);
        }
        calendar.show_dates();

        System.out.println("\nЗадание 5");
        long start = System.nanoTime();
        ArrayList<Integer> first = createArrayList();
        long timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        LinkedList<Integer> second = createLinkedList();
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время добавления 10 элементов в LinkedList: " + timeWorkCode + " наносекунд"); // почему долго
        start = System.nanoTime();
        first.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.remove(4);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время удаления в LinkedList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        first.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в ArrayList: " + timeWorkCode + " наносекунд");
        start = System.nanoTime();
        second.add(1, 100);
        timeWorkCode = System.nanoTime() - start;
        System.out.println("Время вставки в LinkedList: " + timeWorkCode + " наносекунд");
    }
}
