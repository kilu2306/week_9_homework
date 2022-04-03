import java.util.Scanner;

public class Programm_2_MarkSheet {
    /**
     * Write a java program to input student Name, roll No, and three subjects Math, Science and
     * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
     * Input, Marks should between 0 to 100”) and find out total, percentage and result.
     * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
     * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
     * _______________________________
     * | |
     * | Mark Sheet |
     * |_______________________________|
     * | Name : Jay |
     * | Roll No: 08 |
     * |_______________________________|
     * | Subjects : Marks |
     * |_______________________________|
     * | Math : 98 |
     * | Science : 90 |
     * | English : 85 |
     * |_______________________________|
     * | Total : 273 |
     * |_______________________________|
     * | Percentage : 91.0 |
     * | Result : Pass |
     * | Grade : A+ |
     * |_______________________________|
     *
     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name :");
        String name = scanner.next();
        System.out.println("roll no:  ");
        int num = scanner.nextInt();
        System.out.println("subject name :");

        System.out.println("maths");
        int sub1 = scanner.nextInt();
        if (sub1 <= 0 || sub1 > 100) {
            System.out.println("invalid number : enter betweenn 0 to 100");
            sub1 = scanner.nextInt();
        }
        System.out.println("science");
        int sub2 = scanner.nextInt();
        if (sub2 <= 0 || sub2 > 100) {
            System.out.println("invalid number :enter betweenn 0 to 100");
            sub2 = scanner.nextInt();
        }

        System.out.println("English");
        int sub3 = scanner.nextInt();
        if (sub3 <= 0 || sub3 > 100) {
            System.out.println("invalid number : neter betweenn 0 to 100");
            sub3 = scanner.nextInt();
        }

        int total = sub1 + sub2 + sub3;
        int per = total / 3;
        String result = "";
        String grade = "";
            while  (per <= 100) {
                if( per>=80)
                {result = result + "pass";
                System.out.println(result);
                grade = grade + "A+";
                System.out.println(grade);}
             else if (per >= 60 && per < 80)
                { result = result + "pass";
                System.out.println(result);
                System.out.println(grade + "A");}
             else if (per >= 50 && per < 60)
                {result = result + "pass";
                 System.out.println(result);
                grade = grade + "c";
                System.out.println(grade);
            } else
                {result = result + "fail";
                System.out.println(result + "fail ");
                grade = grade + "c";
                System.out.println(grade + "c");}
             break;
            }
            System.out.println("----------------------------------------");
            System.out.println("|                                       |");
            System.out.println("|              Marksheet                |");
            System.out.println("|                                       |");
            System.out.println("----------------------------------------");

            System.out.println("|           name        :    " + name + "       |");
            System.out.println("|           Rolll No:   :    " + num + "        |");
            System.out.println("|          Subjects     :    " + " Marks " + "   |");
            System.out.println("|-------------------------------------|");
            System.out.println("|          Math          :    " + sub1 + "       |");
            System.out.println("|          Science       :    " + sub2 + "       |");
            System.out.println("|         English        :    " + sub3 + "       |");
            System.out.println("|---------------------------------------|");
            System.out.println("|          Total         :    " + total + "      |");
            System.out.println("|--------------------------------------- |");
            System.out.println("|         Percentage     :     " + per + "       |");
            System.out.println("|         Result         :     " + result + "     |");
            System.out.println("|         Grade          :     " + grade + "       |");


        }

    }
