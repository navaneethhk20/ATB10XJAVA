package Java_Basics.Practice31;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
//        Electricity Bill Calculation (Based on Units Consumed)
//           :- take the input from the user of Units.
//                Implement Rate Structure:
//        Define the rate structure for calculating the bill based on the number of units consumed.
//            :-  First 100 units: 0.50Rs per unit
//        :-  Next 100 units (101-200): 0.75Rs per unit
//        :- Next 100 units (201-300): 1.20Rs per unit
//        :- Above 300 units: 1.50Rs per unit
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units you have consumed");
        int units = sc.nextInt();

        if (units > 0 && units <= 100) {
            System.out.println(units * 0.50 + "Rs electricity bill you need pay");
        } else if (units >= 101 && units <= 200) {
            System.out.println(units * 0.75 + "Rs electricity bill you need pay");
        } else if (units >= 201 && units <= 300) {
            System.out.println(units * 1.20 + "Rs electricity bill you need pay");
        }else{
            System.out.println(units * 1.50 + "Rs electricity bill you need pay");
        }

    }

}