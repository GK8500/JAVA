public class LLinkedList_kunal {
    private class Node{
        private int value;
        private Node next;
// constructor
        public Node(int value) {
            this.value = value;
        }
 // constructor
        public Node(Node next) {
            this.next = next;
        }
// constructor
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public LLinkedList_kunal() {
        this.size = 0;
    }

// Inserting at first position

    public void insertFirst(int val){
        Node node = new Node(val); // val --> defines the length of LL
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size++;
    }

// Inserting at the end of LL

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;

    }

// Inserting on a given index

    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
        }

        if(index == size){
            insertLast(val);
        }

        Node temp = head;
        for(int i = 1; i < index ; i++){
            temp = temp.next;
        }

        Node node = new Node(val , temp.next);
// The second parameter contains the value of next node (the node after the the node which we have defined). So when we put temp.next there, we actually connect the new node with the next node or replace the null value wuth remain LL
        temp.next = node;
        size++;

    }

// Deleting the first node

    public void deleteFirst(){
        if(head == tail){
            head = head.next;
            tail = null;
        }
//        int val = head.value;
        head = head.next;
        size--;

    }

// Deleting the last element from LL

    public void deleteLast(){
        if(size <= 1){
            deleteFirst();
        }
        Node seconLast = get(size-2);
        int val = tail.value;
        tail = seconLast;
        tail.next = null;
    }
// Delete any element from LL

    public void delete(int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

// get function

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

// find function

    Node find(int val){
        Node temp = head;
        int count = 0;
        while(temp != null) {
            count++;
            if(temp.value == val){
                System.out.println("It is present at "+ count+ " position");
            }
            temp = temp.next;

        }
        return temp;
    }

// Displaying a LL
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
            if(temp == null){
                System.out.println("null");
            }
        }
    }


}
