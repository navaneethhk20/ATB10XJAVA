package Java_Basics.OOPs.Constructors;

public class Lab05 {
    public static void main(String[] args) {
        Car tesla = new Car();
        tesla.name = "Tesla Model 3";
        tesla.year = 2025;
        System.out.println(tesla.name);
        System.out.println(tesla.year);
        System.out.println(tesla.model);

        System.out.println(" --- ");

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);

    }
}
