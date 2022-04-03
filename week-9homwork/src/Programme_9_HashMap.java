import java.util.HashMap;
import java.util.Map;

public class Programme_9_HashMap {
    /**
     * 9. Create a HashMap object called people that will store String keys and Integer
     * values: And use for each loop to iterate the value from Map
     */
    public static void method1() {
        Map<String, Integer> list = new HashMap<>();
        list.put("Taj hotel", 1);
        list.put("Ashoka hotel", 2);
        list.put("Priya hotel", 3);
        list.put("Sakuni hotel", 4);
        //using for  each loop to get value
        for (Map.Entry<String, Integer> data : list.entrySet()) {
            System.out.println(data);
        }
    }

    public static void main(String[] args) {
        method1();
    }
}
