public class main {
    public static void main(String[] args) {
//        LLinkedList_kunal list = new LLinkedList_kunal();
//        list.insertFirst(5);
//        list.insertFirst(9);
//        list.insertFirst(1);
//        list.insertFirst(3);
//        list.insertFirst(7);
//        list.insertFirst(8);
//        list.display();
//        list.insert(89 , 3);
//        list.display();
////        list.deleteLast();
//        list.delete(3);S
//        list.display();
//        list.find(1);
//
//
//        Doubly_LL ll1 = new Doubly_LL();
//        ll1.addFirst(5);
//        ll1.addFirst(8);
//        ll1.addFirst(3);
//        ll1.addFirst(4);
//        ll1.addFirst(9);
//        ll1.add(56987, 2);
//        ll1.display();

        Circular_LL cll = new Circular_LL();
        cll.insert(5);
        cll.insert(1);
        cll.insert(7);
        cll.insert(9);
        cll.insert(2);
        cll.insert(3);
        cll.display();
        cll.delete(7);
        cll.display();
    }


}
