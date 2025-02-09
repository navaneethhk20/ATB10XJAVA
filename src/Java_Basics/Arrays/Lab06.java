package Java_Basics.Arrays;

public class Lab06 {
    public static void main(String[] args) {
        //Sum of array
        int [] num = {45,78,62};
        int sum =0;
        for(int i=0; i<num.length; i++){
            sum =sum+num[i];
        }
        System.out.println(sum);
    }
}
