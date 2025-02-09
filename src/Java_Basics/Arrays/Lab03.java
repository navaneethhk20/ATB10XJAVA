package Java_Basics.Arrays;

import java.util.Arrays;

public class Lab03 {
    public static void main(String[] args) {
        int [] marks = {65,85,95,74,67};
        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
    }
}
