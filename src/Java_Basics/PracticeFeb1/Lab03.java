package Java_Basics.PracticeFeb1;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
//        Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
//           :- take the Site URL input from the user
//        Example Scenarios
//        Input: example.com
//        Output: The website type is: Commercial website
//        Input: example.org
//        Output: The website type is: Non-profit organization
//        Input: example.edu
//        Output: The website type is: Educational institution
//        Input: example.gov
//        Output: The website type is: Government website
//        Input: example.net
//        Output: The website type is: Network-related website
//        Input: example.info
//        Output: The website type is: Informational website
//        Input: example.xyz
//        Output: The website type is: Unknown or other types of websites
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String website = sc.next();

        if (website.contains(".com")) {
            System.out.println("It's an commercial website");
        } else if (website.contains(".org")) {
            System.out.println("Non profit organisation");
        } else if (website.contains(".edu")) {
            System.out.println("Educational institute");
        } else if (website.contains(".gov")) {
            System.out.println("government website");
        } else if (website.contains(".net")) {
            System.out.println("network related website");
        } else if (website.contains(".info")) {
            System.out.println("information website");
        } else {
            System.out.println("Unknown or other types of websites");

        }
    }
}