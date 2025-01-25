package Java_Basics.ConditionandLoops;

public class Lab02 {
    public static void main(String[] args) {
        //Not taking input from user and using arguments
        int age = Integer.parseInt(args[0]);
        if (age>18){
            System.out.println("Allowed to vote");
        }else{
            System.out.println("Not Allowed");
        }
    }
}
