package Java_Basics.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.List;

public class Lab02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("6");
        list.add("4");
        list.add("3");
        list.add("true");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));
        System.out.println(list.indexOf("3")); //find the first occ of element in list
        System.out.println(list.lastIndexOf("3")); //find the last occ of element in list

        System.out.println(list);
        System.out.println("--------");

        for (int i =1; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
