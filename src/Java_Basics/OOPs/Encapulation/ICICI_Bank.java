package Java_Basics.OOPs.Encapulation;

public class ICICI_Bank {
    private String name;
    private long balance;
    //Parameterised constructor
    public ICICI_Bank(String name, long balance){
        this.name=name;
        this.balance=balance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public long getBalance(){
        return balance;
    }
    public void setBalance(long balance){
        this.balance= balance;
    }
}
