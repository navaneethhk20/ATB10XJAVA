package Java_Basics.CollectionFrameWork.Set;

import java.util.HashSet;

public class Lab03 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Orange");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        System.out.println("Set elements: " + set);
    }
    }

