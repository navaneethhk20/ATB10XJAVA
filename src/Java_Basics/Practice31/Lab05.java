package Java_Basics.Practice31;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
//        Calculate Bonus Based on Salary and Years of Experience.
//          :- take the salary and Year info from the User.
//        Implement Bonus Calculation Logic:
//        Define the bonus structure based on salary and years of experience.
//           :- If years of experience is less than 1 year: No bonus.
//           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
//           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
//           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you salary");
        int salary = sc.nextInt();
        System.out.println("Enter the years of experience you have");
        int years = sc.nextInt();

        if (years < 1) {
            System.out.println("No bonus");
        } else if (years >= 1 && years <= 3) {
            System.out.println((salary / 100) * 5);
        } else if (years >= 4 && years <= 6) {
            System.out.println((salary / 100) * 10);
        } else if (years > 6) {
            System.out.println((salary / 100) * 15);

        }
    }
}
