import java.util.HashMap;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        HashMap<Double, String> a = new HashMap<>();
        a.put(4, "bruh");
        a.put(6, "hurb");
        a.put(8, "burh");
        for (Map.Entry<Double, String> el : a.entrySet())
            System.out.println(el.getKey() + " " + el.getValue());
    }
}