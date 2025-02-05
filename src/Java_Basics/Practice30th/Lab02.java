package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
       // Find the Smallest of Two Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num2);
        }
        else {
            System.out.println(num1);
        }
    }
}
