package Java_Basics.OOPs.Polymorphisam.MethodOverloading;

public class Lab01 {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        mathOperation.add();

    }
}
class MathOperation{

    // Method will be Over load
    // Same name button different Argument or param

    void add(){
        System.out.println("Wife Zero Argument");
    }

    int add(int a, int b) {
        return a + b;
    }

    float add(float a, float b) {
        return a + b;
    }

    void add(int a, int b, int c) {
        System.out.println("Hello");
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, double b, float f) {
        return a + b + f;
    }
}

