package Java_Basics.PracticeFeb7;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        // Check if a Number is Prime
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num= sc.nextInt();

        int count = 0;
        // to check prime number
        if(num == 2) {
            System.out.println(num + " is a prime number");
        } else {
            // checking number of factors
            for(int i = 1; i <= num; i++) {
                if(num % i == 0) {
                    count++;
                }
            }
            // checking number of counts to print result
            if(count == 2) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }

    }
}
