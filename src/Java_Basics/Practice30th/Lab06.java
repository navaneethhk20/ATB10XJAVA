package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        //Check if a Character is an Alphabet.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data");
        char alph = sc.next().charAt(0);

        if(Character.isAlphabetic(alph)){
            System.out.println("Alphabet");
        }else {
            System.out.println("Not an Alphabet");
        }
    }
}
