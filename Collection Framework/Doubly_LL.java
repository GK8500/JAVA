public class Doubly_LL {
    static head;

    private class Node{
        int value;
        Node prev;
        Node next;
    }

    public addFirst(int value){
        Node node = new Node;
        node.next = head;
        node.prev = null;
        head.prev = node;
        head = node;

    }
    public static void main(String[] args) {
        
    }
}
