package Java_Basics.ConditionandLoops;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("Not allowed");
        }
        sc.close();
    }
}
