package Java_Basics.Practice30th;

import java.util.Scanner;

public class Lab08 {
    public static void main(String[] args) {
        //Check if a Triangle is Valid Based on Three Sides.
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side 2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side 3");
        int side3 = sc.nextInt();

        if(side1+side2>side3 && side2+side3>side1 && side3+side1>side2){
            System.out.println("it is a triangle");
        }else {
            System.out.println("not a trianlge");
        }
        sc.close();
    }
}
