package Java_Basics.OOPs.Super_KeyWord;

public class Lab01 {
    public static void main(String[] args) {
        Mobile iphone = new Mobile("iphone15","2023");
        System.out.println( iphone.model_name);
        System.out.println(iphone.year_of_luanch);

        iphone.display();
        String give_me=iphone.give_me_model_name();
        System.out.println(give_me);
    }


}
class Mobile{
    String model_name;
    String year_of_luanch;

   Mobile(String model_name, String year_of_luanch){
    this.model_name=model_name;
    this.year_of_luanch=year_of_luanch;
    }

    void display(){
        System.out.println(this.model_name + " - "+ this.year_of_luanch);
    }
    String give_me_model_name(){
         return model_name;
    }
}
