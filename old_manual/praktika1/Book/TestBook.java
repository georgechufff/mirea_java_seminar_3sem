import java.lang.*;
public class TestBook {
    public static void main(String[] args){
        Book b1 = new Book("Catcher in the Rye", 345);
        Book b2 = new Book("Let us praise the famous men", 250);
        Book b3 = new Book();
        System.out.print("b1: ");
        b1.Tester();
        System.out.println("b2: "+ b2.toString());
        System.out.print("b3: ");
        b3.Tester();
        b3.SetName("The Great Gatsby");
        b3.SetCount(467);
        System.out.print("edited b3: ");
        b3.Tester();
    }
}
