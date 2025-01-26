package Java_Basics.Switch;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        // User - Enter int number from 1 to 7
        // Which day it is it
        // 1 -> mon, 4 -> thur, 7 -> sun, 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number between 0 to 7");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("I don't recognize , please enter the number 0 to 7 ");
        }
        sc.close();
    }
}
