package Java_Basics.String;

public class Lab02 {
    public static void main(String[] args) {


        String s1 = "Hello";
        String s4 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");

        //== comparison ->String -> This checks location reference
        System.out.println(s1==s3);
        System.out.println(s4==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);

        //equals checks content -> value
        //How to check value?
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));
    }
}