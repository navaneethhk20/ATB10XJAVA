package Java_Basics.Functions;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {

        //Create a function of sum, subtraction, multiplication, division and modulus
        //with parameter a,b  and take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a=0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else {
            System.out.println("Enter int value");
            System.exit(0);
        }
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int result1 = sum(a , b);
        int result2 = sub(a , b);
        int result3 = mul(a , b);
        int result4 = div(a , b);
        int result5 = mod(a , b);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);



    }
    static int sum(int a, int b){
    return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int div(int a, int b){
        return a/b;
    }
    static int mod(int a, int b){
        return a%b;
    }
}


