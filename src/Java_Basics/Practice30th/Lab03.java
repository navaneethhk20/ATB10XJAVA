package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //Find the Smallest of Three Numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");
        int num2 = sc.nextInt();
        System.out.println("Enter the num3");
        int num3 = sc.nextInt();

        if(num1< num2 && num1<num3){
            System.out.println(num1);
        } else if(num2<num3 && num2< num1){
            System.out.println(num2);
        }
        else {
            System.out.println(num3);
        }
        {

        }
        sc.close();
    }
}
