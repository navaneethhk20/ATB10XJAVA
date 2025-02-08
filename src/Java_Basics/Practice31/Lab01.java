package Java_Basics.Practice31;

import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        //Check if a Number is a Palindrome.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int original_numb = sc.nextInt();

        int temp_numb= original_numb;

        int rev=0;

        while(temp_numb!=0){
            rev= rev*10 + temp_numb%10;
            temp_numb = temp_numb/10;
        }
        System.out.println(rev);
        if(rev == original_numb){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
}
