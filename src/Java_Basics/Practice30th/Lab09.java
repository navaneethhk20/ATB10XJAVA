package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab09 {
    public static void main(String[] args) {
//        ATM Withdrawal Simulation. (Follow Below Steps to Write Program)
//        Steps to Write the Program
//        1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
//        2️⃣ Take user input for the amount they want to withdraw.
//        3️⃣ Check withdrawal conditions:
//        The amount should be greater than zero.
//                The amount should be a multiple of 100 (common ATM rule).
//        The amount should not exceed the account balance.
//        4️⃣ Deduct the amount from the balance if conditions are met.
//        5️⃣ Display the updated balance or an error message if the withdrawal fails.

        int intial_balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdrawl");
        int withdraw_amt = sc.nextInt();

        if( (withdraw_amt<=intial_balance) && (withdraw_amt>0) && (withdraw_amt%100==0) ){
            System.out.println(withdraw_amt+" is getting deducted");
            System.out.println("Balance amount is" +(intial_balance - withdraw_amt));
        }else {
            System.out.println("Withdraw failed , try entering less than you balance amount");
        }
    }
}
