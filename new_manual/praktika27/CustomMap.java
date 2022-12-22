import java.util.HashMap;
import java.util.Map;

public class CustomMap {
    public static HashMap<String, String> createMap(){
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                map.put("Check"+i, "even");
            }
            else{
                map.put("Check"+i, "odd");
            }

        }
        return (HashMap<String, String>) map;
    }
    public static int getCountTheSameFirstName(HashMap<String, String> map, String name){
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name))
                count++;
        }
        return count;
    }
    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya){
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(familiya))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        HashMap<String, String> ss = createMap();
        System.out.println(ss);
        System.out.println(getCountTheSameFirstName(ss, "odd"));
        System.out.println(getCountTheSameLastName(ss, "Check1"));
    }

}