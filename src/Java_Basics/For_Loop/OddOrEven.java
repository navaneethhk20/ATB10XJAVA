package Java_Basics.For_Loop;

public class OddOrEven {
    public static void main(String[] args) {
        //TO find the even numbers from 1 to 50
        for(int i=1; i<=50;i++){
          if(i%2==0){
              System.out.println("Entered number is Even ->" +  i);
          }else {
              System.out.println("Entered number is Odd ->" +  i);
          }
        }
    }
}
