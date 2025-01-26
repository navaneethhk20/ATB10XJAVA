package Java_Basics.Switch;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item code");
        int itemCode = sc.nextInt();

        switch (itemCode){
            case 1,2,3:
                System.out.println("Belongs to Electronic section");
                break;
            case 4,5,6:
                System.out.println("Belongs to Food section");
                break;
            case 7,8,9:
                System.out.println("Belongs to Sports section");
                break;
            default:
                System.out.println("Do not recognize the number");
        }
        sc.close();
    }
}
