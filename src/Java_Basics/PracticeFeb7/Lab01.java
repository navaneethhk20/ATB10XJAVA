package Java_Basics.PracticeFeb7;

import javax.swing.text.EditorKit;
import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
// Print Numbers from 10 to 1 (Reverse Order)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
for(int i=num; i>0; i--){
    System.out.print(i+" ");
}
    }
}
