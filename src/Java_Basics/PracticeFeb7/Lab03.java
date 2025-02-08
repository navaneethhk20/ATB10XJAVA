package Java_Basics.PracticeFeb7;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        //Multiplication Table of a Given Number (take the input from user).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + i * num);
        }
    }
}
