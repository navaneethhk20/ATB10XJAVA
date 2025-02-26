package Java_Basics.OOPs.Abstraction.Interface;



public class Lab01 {
    public static void main(String[] args) {
        Wagon wagon = new Wagon();
        wagon.drive();
    }
    }

    class Wagon extends Engine {
        @Override
        void startEngine(){
            System.out.println("start engine");
        }

        void drive(){
            startEngine();
            System.out.println("I am driving");
            stopEngine();
        }
    }
    abstract class Engine {
        Engine() {
            //useless
        }

        abstract void startEngine();

        void stopEngine() {
            System.out.println("stop engine");
        }
    }
        interface Tyre{
            void m2();
        }


