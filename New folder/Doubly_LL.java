public class Doubly_LL {
    Node head;


    private class Node {
        int value;
        Node prev;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

// Adding a new value at the beginning
    public void addFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

// Adding a new value at the end

    public void addLast(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

// Adding a value in between an LL

    public void add(int val , int index)






















































    {
        Node temp = head;
        Node node = new Node(val);
        if(node.next == null){
            addFirst(val);
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        node.next = temp.next;  // node --> node.next
        temp.next = node;       // temp --> node
        node.prev = temp;       // temp <-- node
        node.next.prev = node;  // node <-- node.next
    }

// Displaying DLL
    public void display() {
        Node node = head;
        Node last = null;
        System.out.print("START" + " <--> ");
        while (node != null) {
            System.out.print(node.value + " <--> ");

            last = node;
            node = node.next;
        }
        System.out.println("END" );

// Display in reverse

        System.out.println("print in reverse");
        System.out.print("END" + " <--> ");
        while(last != null){
            System.out.print(last.value+ " <--> ");
            last =  last.prev;
        }
        System.out.println("START");
    }






}