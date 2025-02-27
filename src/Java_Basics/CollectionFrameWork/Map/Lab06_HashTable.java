package Java_Basics.CollectionFrameWork.Map;

import java.util.Hashtable;

public class Lab06_HashTable {
    public static void main(String[] args) {
        // Map - K, V,  null values allows

        // Hashtable - Synchronised, Slow and Legacy Class - Thread Safe
        // T1, T2 - they will use one by one.

        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
//        ht1.put(4, null); java.lang.NullPointerException
//        ht1.put(null, "three"); // java.lang.NullPointerException
        System.out.println(ht1);
    }
}
