package Java_Basics.OOPs.Encapulation;

public class Lab01 {
    public static void main(String[] args) {
        ICICI_Bank iciciBank = new ICICI_Bank("Nithu",3000);
        System.out.println(iciciBank.getBalance());
        iciciBank.setBalance(500);
        System.out.println(iciciBank.getBalance());
        System.out.println(iciciBank.getName());
        iciciBank.setName("navaneeth");
        System.out.println(iciciBank.getName());

    }
}
