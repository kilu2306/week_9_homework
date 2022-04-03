import java.util.ArrayList;

public class Programme_7_UnderGroundArrayList {
    /**
     * Write a Java program to test an array list is empty or not. Define array list with
     * underground tube names
     */

    public static void main(String[] args) {

      //  declared array list
        ArrayList<String> list = new ArrayList<>();
        //defined value
        list.add("Bakerloo");
        list.add("Central");
        list.add("Jubilee");
        list.add("Northern");
        list.add("Piccadilly");
        list.add("Victoria");
        list.add("Waterloo");
        list.add("City lines");
//array  list is empty or not
        System.out.println(list.isEmpty());
    }
}