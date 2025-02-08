package Java_Basics.PracticeFeb7;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Calculate the factorial of a number using a for loop:

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact= 1;

        for(int i=1; i<num; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
