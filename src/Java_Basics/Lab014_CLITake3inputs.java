package Java_Basics;

public class Lab014_CLITake3inputs {
    public static void main(String[] args) {
        String name = args[0];

        String age = args[1];
        int age1 = Integer.parseInt(age);

        String salary = args[2];
        int salary2 = Integer.parseInt(salary);

        System.out.println(name);
        System.out.println(age1);
        System.out.println(salary2);

    }
}
