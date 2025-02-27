package Java_Basics.CollectionFrameWork.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lab02_LinkedHashMap {
    public static void main(String[] args) {
        Map m2 = new LinkedHashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m2.put("name","pramod");
        m2.put("rollno",1);
        m2.put("phone",987654321);
        System.out.println(m2);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
