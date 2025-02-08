package Java_Basics.PracticeFeb1;

import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
//        Find if a Person is Senior Citizen Based on Age.
//         :- take the age input from the user.
//        Implement Age Category Logic:
//        Define the criteria for different age categories:
//        Child: Age 0 to 12
//        Teenager: Age 13 to 19
//        Adult: Age 20 to 64
//        Senior Citizen: Age 65 and older
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = sc.nextInt();
       if (age<=0 ){
           System.out.println("age should be greater than 0");
        }else if (age>0 && age<=12){
            System.out.println("You are a child");
        } else if (age>=13 && age<=19) {
            System.out.println("You are a teenager");
        }else if (age>20 && age<=64){
            System.out.println("You are an Adult");
        }else {
            System.out.println("You are a senior citizen");
        }
        sc.close();
    }
}
