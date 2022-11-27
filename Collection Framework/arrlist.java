import java.util.*;

public class arrlist {
    public static void main(String[] args) {
        // Interger | String | Boolean | 
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

        // add elememts
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);
        
        // get elements
        int element = list.get(2);
        // list.get(0);
        // list.get(1);
        
        System.out.println(element);

        // to add element in between(append)

        list.add(1,9);
        System.out.println(list);

        // set element (replace existing element)

        list.set(0, 5);
        System.out.println(list);

        // delete element
        list.remove(3);
        System.out.println(list);

        // lenght of AL
        int size = list.size();
        System.out.println(size);
        // System.out.println(list.size);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);

    }
}
