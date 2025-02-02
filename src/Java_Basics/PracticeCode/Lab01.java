package Java_Basics.PracticeCode;

import com.sun.jdi.CharValue;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
//        Write a Programs for
//        1) Check if a Number is Positive or Negative.
//        2)Check if a Number is Even or Odd.
//        3) Find the Maximum of Two Numbers.
//        4) Check if a Character is a Vowel or Consonant.
//        5) Check if a Person is Eligible to Vote (Age Check).
        // 1) Check if a Number is Positive or Negative.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int num = sc.nextInt();
//
//        if (num>= 0){
//            System.out.println("Number is positive");
//        }else {
//            System.out.println("Negative");
//        }
//
//        //2)Check if a Number is Even or Odd.
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int num1 = sc1.nextInt();
//
//        if(num1%2 == 0){
//            System.out.println("Number is even");
//        }else {
//            System.out.println("Number is odd");
//        }

        //3) Find the Maximum of Two Numbers.
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("Enter the num1");
//        int n1 = sc2.nextInt();
//        System.out.println("Enter the num2");
//        int n2 = sc2.nextInt();
//
//        if(n1>n2){
//            System.out.println("n1 is maximum");
//        }else {
//            System.out.println("n2 is maximum");
//        }

        //4) Check if a Character is a Vowel or Consonant.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the character");
//        char ch = sc.next().charAt(0);
//        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
//            System.out.println("Vowel");
//        }else {
//            System.out.println("consonant");
//        }
        //5) Check if a Person is Eligible to Vote (Age Check).
        // age>18 is allowed to vote
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc2.nextInt();

        if(age>=18){
            System.out.println("Allowed to vote");
        }else {
            System.out.println("Not allowed");
        }
    }
}
