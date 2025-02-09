package Java_Basics.Arrays;

import java.util.Arrays;

public class Lab07 {
    public static void main(String[] args) {
        //Find second largest
        int [] num = {45,65,32,96,78,25};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(num[num.length-2]);
        System.out.println(num[0]);
    }
}
