public class Circular_LL {

     private Node head;
     private Node tail;

     // constructor

    public Circular_LL() {
    }

    public Circular_LL(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    private class Node{
        int value;
        Node next;

        // constructor

        public Node(Node next) {
            this.next = next;
        }

        public Node(int val) {
            this.value = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);

        if(head == null){
            tail = node;
            head = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display(){
        Node temp = head;
        if(head != null){
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while (temp != head);
        }
        System.out.println("HEAD");
    }

    public void delete(int val){
        Node temp = head;
        if(temp == null){
            return;
        }
        if(temp.value == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if(n.value == val){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp != head);

    }

}
