package Java_Basics.Practice31;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
       // Calculate Employee Net Salary (Basic Pay, HRA, DA, Tax Deductions,)
        // Reserch from your side for this program.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic pay");
        int basicPay = sc.nextInt();
        System.out.println("House rent allowance");
        int hra = sc.nextInt();
        System.out.println("Dearness Allowance");
        int da = sc.nextInt();

        int grossSalary = basicPay+hra+da;
        System.out.println("Your gross salary is "+grossSalary);

        int pf = (grossSalary*5)/100;
        System.out.println("Your PF deduction from your gross salary is  "+pf);

        // standard tax of 15% of gross salary
        int tax = (grossSalary*15)/100;
        System.out.println("Your tax deduction from your gross salary is  "+tax);

        int netSalary =grossSalary- (pf +tax);


        System.out.println("Your net salary after PF & Tax deduction is  "+netSalary);



    }
}
