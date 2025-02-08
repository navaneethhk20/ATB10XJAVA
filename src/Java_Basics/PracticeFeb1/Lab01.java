package Java_Basics.PracticeFeb1;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        // Check if a Number is Divisible by 5 and 11

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        if(number%5==0 && number%11==0){
            System.out.println(number+" is divisible by 5 && 11");
        }else if(number%11==0){
            System.out.println(number+ " is divisible by 11");
        }else {
            System.out.println(number+" number is divisible by 5");
        }
    }
}
