package Java_Basics.CollectionFrameWork.Set;

import java.util.Set;
import java.util.TreeSet;

public class Lab05_TreeSet {
    public static void main(String[] args) {
        Set ts = new TreeSet();
        ts.add("nithu");
        ts.add("apple");
        ts.add("window");
        ts.add("nithu");
        System.out.println(ts);
    }
}
