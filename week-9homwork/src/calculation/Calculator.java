package calculation;

public class Calculator {
    /**
     * Write a java program using the following descriptions
     * 1. Create one package with name calculate
     * 2. Create two class with name “Calculator” and “Main”
     * 3. Create four methods with manes “addition”, “subtraction”, “division”,
     * and “multiplication”. All methods are instance method and it doesn’t
     * return anything. But it has two parameters with name “int a” and “int
     * b”. Also each method have System.out.println(). This prints the result.
     * Also create all one more method with name “calculateResult” with
     * three parameter with name int a, int b and char symbol. Write the logic
     * in calculateResult method that when user enter first number and
     * second number and symbol based on symbol it does calculate.
     * 4. Write a “main” method into main class. It has scanner that takes user
     * input. Also write the logic that it ask user to “Enter first Number:”,
     * “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
     * enter + symbol result like “Addition of 5 and 10 is: 15” and respective
     * for other symbol.
     * 5. With the result it’s also print one more message “Would you like to do
     * more calculation Please enter “Y” or “N” :” (Hint use while loop if user
     * enter Y program asking the user to enter First Number, and if user enter
     * N programme should terminate)
     */
    //creating maathod named addition
    public void addition(int a, int b){

        System.out.println("Addition of "+a +" and "+ b +" is : "+ (a+b));
    }
    //2. creating method named substraction
    public void subtraction(int a, int b ){
        System.out.println("Subtraction  of "+a +" and "+ b +" is : "+ (a-b));
    }
    //3. creating method named division
    public void division(int a , int b ){
        System.out.println("division of "+a +" and "+ b +" is : "+ (a/b));
    }

    //creating method named multiplication
    public void multiplication(int a , int b ){
        System.out.println("Multiplication  of "+a +" and "+ b +" is: "+ (a*b));

    }
    //creating method named calculatingresult
    public void calculateResult (int a, int b, char symbol ){
        if (symbol=='+'){
            int sum=a+b;
            this.addition(a,b);}
        else if (symbol=='-'){
            int sub= a-b;
            this.subtraction(a,b);
        }else if (symbol=='/') {
            int div = a / b;
            this.division(a,b);
        }else  {int multi=a*b;
        this.multiplication(a,b);}

    }
}

