package Java_Basics.PracticeFeb1;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {
//        Convert Days into Years, Months, and Days.
//       :- Take the Days Input from the User
//        Define the conversion logic:
//        :- Assume 1 year = 365 days.
//        :- Assume 1 month = 30 days
//        :- Convert the Days into Years, Month and days and Print it.
//        if you input 1000 days, the output of the program would be:  2 years, 9 months, and 0 days.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int totalDays = sc.nextInt();

                int years = totalDays / 365;
        System.out.println(years);
                // Calculate remaining days after subtracting years
                int remainingDaysAfterYears = totalDays % 365;
        System.out.println(remainingDaysAfterYears);
                // Calculate months from remaining days
                int months = remainingDaysAfterYears / 30;
        System.out.println(months);
                // Calculate remaining days after subtracting months
                int days = remainingDaysAfterYears % 30;
        System.out.println(days);
                // Output the result
                System.out.println(totalDays + " days is equivalent to: ");
                System.out.println(years + " years, " + months + " months, and " + days + " days.");

                // Close the scanner
                sc.close();
            }

}
