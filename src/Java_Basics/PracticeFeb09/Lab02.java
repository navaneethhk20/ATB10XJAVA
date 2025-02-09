package Java_Basics.PracticeFeb09;

import java.util.Arrays;

public class Lab02 {
    public static void main(String[] args) {
        //Second smallest number  in any array.
        int [] num = {45,95,78,6,4};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[1]);
    }
}
