package Java_Basics.ConditionandLoops;

import java.util.Scanner;

public class FindTheNumberIsEvenOrOdd {
    public static void main(String[] args) {
        //Find Even or Odd Number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Entered number is even ->" +num);
        }else{
            System.out.println("Entered number is odd ->" +num);
        }
        sc.close();
    }
}
