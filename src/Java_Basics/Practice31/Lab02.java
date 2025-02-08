package Java_Basics.Practice31;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
                //Check if a Number is an Armstrong Number.
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number");
                int input = sc.nextInt();
                int temp = input;
                int newNum =0;

                while(input!=0){
                    int digit = input%10;
                    newNum = digit* digit*digit + newNum;
                    input = input/10;
                }
                if (temp == newNum){
                    System.out.println("it is an armstrong number");
                }else {
                    System.out.println("not a armstrong number");
                }

    }
}
