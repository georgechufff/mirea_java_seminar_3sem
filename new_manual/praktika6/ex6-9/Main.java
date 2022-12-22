//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ArrayList<Printable> objects = new ArrayList();
        objects.add(new Book("Catcher in the Rye", "Jerome D. Salinger", 240));
        objects.add(new Book("Crime and Punishment", "Fyodor Dostoevsky", 650));
        objects.add(new Book("Moscow 2042", "Voinovich", 350));
        objects.add(new Shop("Cosmopolitan"));
        Iterator var2 = objects.iterator();

        while(var2.hasNext()) {
            Printable obj = (Printable)var2.next();
            obj.print();
        }

    }
}
