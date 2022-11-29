public class Doubly_LL {
    static Node head;

    private class Node{
        int value;
        Node prev;
        Node next;
    }

    public void addFirst(int value){
        Node node = new Node();
        if(head == null){
            node = head;
            node.next = null;
            node.prev = null;

         }
        else{
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
    }
}
