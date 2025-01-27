package Java_Basics.PracticeCode;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.next();

        StringBuilder sb = new StringBuilder(input);
        String rev_input = sb.reverse().toString();
        if(input.equalsIgnoreCase(rev_input)){
            System.out.println("Palindrome ->" +input );
        }else {
            System.out.println("Not a Palindrome ->" +input);
        }
        sc.close();
    }
}
