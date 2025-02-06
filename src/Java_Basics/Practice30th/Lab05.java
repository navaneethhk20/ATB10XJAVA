package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
//        Calculate Grade Based on Marks. (Follow Below Steps to Write Program.)
//        1️⃣ Take user input for marks (Use Scanner class).
//        2️⃣ Check the validity of marks (ensure they are between 0 and 100).
//        3️⃣ Use if-else-if conditions to determine the grade based on marks.
//        4️⃣ Display the grade as output.
//📌 Grading Criteria (Example)
//      Marks Range Grade
//        90 - 100   A+
//        80 - 89     A
//        70 - 79      B
//        60 - 69     C
//        50 - 59      D
//        40 - 49      E
//        Below 40   Fail

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade");
        int score = sc.nextInt();

        if (score>100 || score<=0) {
            System.out.println("Not valid enter score between 0 to 100");
        }

        if (score>90 && score<=100){
            System.out.println("A+");
        }
        else if (score>80 && score<=89) {
            System.out.println('A');
        }
        else if (score>70 && score<=79) {
            System.out.println('B');
        }
        else if (score>60 && score<=69) {
            System.out.println('C');
        }
        else if (score>50 && score<=59) {
            System.out.println('D');
        }
        else if (score>40 && score<=49) {
            System.out.println('E');
        }
        else {
            System.out.println("Fail");
        }

    }
}
