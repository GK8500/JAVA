// linkedlist Collection framework

import java.util.LinkedList;

public class LLCF {
    
    public static void main(String[] args) {
        LinkedList<String> x = new LinkedList<String>();

        x.addFirst("This");
        x.addFirst("is");
        System.out.println(x);
        
        x.addLast("a");
        x.add("list");
        System.out.println(x);
        System.out.println(x.size());
        
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        System.out.println("null");

        x.removeLast();
        System.out.println(x);
        x.removeFirst();
        System.out.println(x);
        x.remove(2);
        System.out.println(x);
    }

}
