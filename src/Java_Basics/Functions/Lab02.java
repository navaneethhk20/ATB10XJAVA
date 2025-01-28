package Java_Basics.Functions;

public class Lab02 {
    public static void main(String[] args) {
        //without parameter and without return
        greet1();
        //without parameter and with return
        String s1 = greet2();
        System.out.println(s1);
        //with parameter and without return
        greet3("Nithu");
        //with parameter and with return
        String s2 = greet4("Hosurukoppalu");
        System.out.println(s2);
    }




    //Without parameter and without return
    static void greet1(){
        System.out.println("Hi1");
    }
    //Without parameter and with return
    static String greet2(){
        return "Hello1";
    }
    //With parameter and without return
    static void greet3(String name){
        System.out.println(name);
    }
    //With parameter and with return
    static String greet4(String village){
        return village;
    }

}
