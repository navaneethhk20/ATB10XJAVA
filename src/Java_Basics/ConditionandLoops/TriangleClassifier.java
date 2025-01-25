package Java_Basics.ConditionandLoops;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        // ✅ Triangle Classifier:
        //Write a program that classifies a triangle based on its side lengths.
        //Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal),
        // or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side2 → eq, iso, scalene

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1");
        int side1 = sc.nextInt();
        System.out.println("Enter the side2");
        int side2 = sc.nextInt();
        System.out.println("Enter the side3");
        int side3 = sc.nextInt();


        if(side1 <=0 || side2<=0 ||side3<=0){
            System.out.println("Not correct, enter correct value");
        }
        else if(side1 == side2 && side1 == side3 && side2 == side3){
            System.out.println("Equilateral triangle");
        } else if (side1 ==side2 || side2 ==side3 ||side1 ==side3 ) {
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }

    }
}
