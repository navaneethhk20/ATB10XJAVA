package Java_Basics.OOPs.Polymorphisam.MethodOverriding;

public class Lab02 {
    public static void main(String[] args) {
        Son son = new Son();
        son.home();

        Father father = new Father();
        father.home();

        Father father1 = new Son();
        father1.home();
    }
}

    class Son extends Father{
    @Override
        void home(){
            System.out.println("2bhk");
        }
    }

    class Father{

        void home(){
            System.out.println("I have 1bhk");
        }
    }


