package calculation;

import java.util.Scanner;

public class Main {
    //creating main method
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number :");
        int a= input.nextInt();
        System.out.println("Enter second number :");
        int b = input.nextInt();
        System.out.println("Please enter one of symbol +,-,*, /:" );
        char c= input.next().charAt(0);
        Calculator obj= new Calculator();
        obj.calculateResult(a,b,c);
    }
}
