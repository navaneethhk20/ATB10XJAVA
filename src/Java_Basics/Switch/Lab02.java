package Java_Basics.Switch;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> execute chrome
        // firefox -> execute of firefox
        // edge -> edge browser cases.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser you want to launch");
        String browser = sc.next();

        switch (browser){
            case "chrome":
                System.out.println("Starting chrome browser");
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                break;
            case "edge":
                System.out.println("Starting edge browser");
                break;
            case "safari":
                System.out.println("Starting safari browser");
                break;
            default:
                System.out.println("I do not recognize the browser");
        }
        sc.close();

    }
}
