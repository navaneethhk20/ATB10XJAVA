package Java_Basics.OOPs.Abstraction.Interface;

public class Lab03 {
    public static void main(String[] args) {
        Son son = new Son();
        son.takeCash();
    }
}
class Son implements Mother,Father{

    void takeCash(){
        MotherCash();
        FatherCash();
    }
    public void MotherCash(){
        System.out.println("5000");
    }
    public void FatherCash(){
        System.out.println("4000");
    }
}

interface Mother{
    void MotherCash();
}
interface Father{
    void FatherCash();
}
