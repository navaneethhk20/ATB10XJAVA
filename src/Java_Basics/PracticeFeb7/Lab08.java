package Java_Basics.PracticeFeb7;

public class Lab08 {
    public static void main(String[] args) {
        // Inverted Right-Angled Triangle.
        for (int i=6;i>=1;i--)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}