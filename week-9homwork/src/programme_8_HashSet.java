import java.util.HashSet;
import java.util.Set;

public class programme_8_HashSet {
    /**
     * 8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
     * Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
     * and if else
     */
    public static void main(String[] args) {
        //declared hashset syntax
        Set<Integer> set = new HashSet();
        //define value
        set.add(4);
        set.add(7);
        set.add(8);

        //using for loop and if else if degit is betwen 1 to 10

        for (int i = 1; i <= 10; i++) {
            if (set.contains(i))
                System.out.println(i + " number has been found  ");
            else System.out.println(i + " " +
                    "number is not in list ");

        }
    }
}