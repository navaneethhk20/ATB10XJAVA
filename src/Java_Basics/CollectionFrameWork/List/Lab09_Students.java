package Java_Basics.CollectionFrameWork.List;

import java.util.ArrayList;

import java.util.List;

public class Lab09_Students {
    public static void main(String[] args) {
        Students s1= new Students("nithu", "01");
        Students s2= new Students("manu", "02");
        Students s3= new Students("kolu", "03");

        List<String> mylist = new ArrayList();
        mylist.add(String.valueOf(s1));
        mylist.add(String.valueOf(s2));
        mylist.add(String.valueOf(s3));

        System.out.println(mylist);
        s1.printdetails();
        s2.printdetails();
        s3.printdetails();



    }
}
