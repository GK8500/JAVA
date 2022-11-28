// Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.

import java.util.*;
// package questions;

public class LL_1 {
    public static void main(String[] args) {
        LinkedList<Integer> i = new LinkedList<Integer>();
        i.addLast(1);
        i.addLast(5);
        i.addLast(7);
        i.addLast(3);
        i.addLast(8);
        i.addLast(2);
        i.addLast(3);

        System.out.println(i);

        for (int j = 0; j < i.size(); j++) {
            if(i.get(j) == 7){
                System.out.println("The indexx of 7 is " + j);
            }
        }
    }
}
