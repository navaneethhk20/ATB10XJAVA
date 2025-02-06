package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        //Check if a Year is a Leap Year.
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year %4 == 0 && year%100 !=0 || year%400 ==0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }
    }
}
