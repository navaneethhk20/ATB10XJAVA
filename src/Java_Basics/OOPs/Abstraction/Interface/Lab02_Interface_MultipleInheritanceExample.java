package Java_Basics.OOPs.Abstraction.Interface;

public class Lab02_Interface_MultipleInheritanceExample {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();
    }
}
class Car1 implements Engine1, Break{
    void drive(){
        startEngine();
        applyBrake();
        stopEngine();
    }

    @Override
    public void applyBrake() {
        System.out.println("appling break");
    }

    @Override
    public void startEngine(){
        System.out.println("Starting the egnine");
    }
    @Override
    public void stopEngine(){
        System.out.println("stopping the engine");
    }

}

interface  Engine1{
    void startEngine();
    void stopEngine();
}

    interface Break{
        void applyBrake();
    }

