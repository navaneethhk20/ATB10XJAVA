package Java_Basics.CollectionFrameWork.Queue;

import java.util.PriorityQueue;

public class Lab01 {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Pramod");
        q.add("Dutta");
        System.out.println(q);
        q.add("nithu");

        // Queue -> First in First Out
        //offer - add
        //peek - see the first element (fifo element) which want to remove
        //poll - delete

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
    }

