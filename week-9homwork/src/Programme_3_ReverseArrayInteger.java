import java.util.Scanner;

public class Programme_3_ReverseArrayInteger {
    //Write a Java program to reverse an array of integer values

    public void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter  size of array  :");
        int a = input.nextInt();
        //declare an array; a == size
        int[] array = new int[a];
        System.out.println("enter array value :");
        //inout array vaalue
        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }
        int temp;
        int start = 0;
        int end = a - 1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
            //reverse array
            System.out.println("after reverse array  :");
            for (int j = 0; j < a; j++) {
                System.out.println(array[j]);
            }
        }
    }

    public static void main(String[] args) {
        Programme_3_ReverseArrayInteger obj = new Programme_3_ReverseArrayInteger();
        obj.method1();

    }

}
