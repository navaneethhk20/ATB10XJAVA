package Java_Basics.BasicLabEx;

public class Lab012_LargestOf3Numbers {
    public static void main(String[] args) {
    int num1 = 10;
    int num2 = 80;
    int num3 = 40;
    int largest = (num1 > num2) ? (num1>num3)? num1:num3:(num2 > num3)? num2 : num3;
    System.out.println("Largest number is"+largest);
}

}
