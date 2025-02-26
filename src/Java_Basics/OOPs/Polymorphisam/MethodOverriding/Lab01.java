package Java_Basics.OOPs.Polymorphisam.MethodOverriding;

public class Lab01 {
    public static void main(String[] args) {
        Hound hound = new Hound();
        hound.bark();
    }
}
    class Dog{
        void bark(){
            System.out.println("bark");
        }
    }

    class Hound extends Dog{
        @Override
        void bark(){
            System.out.println("Hound bark");
        }
    }

