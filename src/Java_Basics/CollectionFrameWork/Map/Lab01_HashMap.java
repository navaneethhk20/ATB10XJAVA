package Java_Basics.CollectionFrameWork.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab01_HashMap {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key - value
        // name : pramod,
        // rollno : 1
        // phone : 9876543210
        m1.put("name","pramod");
        m1.put("rollno",1);
        m1.put("phone",987654321);
        System.out.println(m1);
        // {phone=987654321, name=pramod, rollno=1}
    }
}
