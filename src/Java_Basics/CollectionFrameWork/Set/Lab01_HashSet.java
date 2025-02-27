package Java_Basics.CollectionFrameWork.Set;

import java.util.HashSet;
import java.util.Set;

public class Lab01_HashSet {
    public static void main(String[] args) {
        Set hs = new HashSet();
        hs.add("Nithu");
        hs.add("rithu");
        hs.add("Nithu");
        hs.add("nava");
        hs.add("neeth ");
        System.out.println(hs);
        Set hs1 = new HashSet();
        hs1.add("Pramod");
        hs1.add("Pramod");
        hs1.add("pramod");
        hs1.add("dramod");
        System.out.println(hs1);

    }
}
