package Java_Basics.OOPs.Inheritance.MultilevelInheritance;

public class Lab01 {
    public static void main(String[] args) {
        Child c = new Child();
        c.BHK3();
        c.BHK2();
        c.BHK1();

        Father f= new Father();
        f.BHK2();
        f.BHK1();

        GrandFather gf = new GrandFather();
        gf.BHK1();

    }
}
