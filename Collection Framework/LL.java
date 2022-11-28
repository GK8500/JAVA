// package Collection Framework;

public class LL {

    static Node head;

    class Node{
        String value;
        Node next;

        Node(String value){
            this.value = value;
            this.next = null;
        }
        Node(String value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    // add- First
    public void addFirst(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
// We created a new node, then made that node poit to head and then made the new node head.
        newNode.next = head;
        head = newNode; // head gets the new value of newNode.

    }

    // add- Last

    public void addLast(String value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // add
    public void add(String value, int index){
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n1 = new Node(value, temp.next);
        temp.next = n1;

    }

    // Delete -First
    public void deletefirst(){
        if(head == null){
            System.out.println("The List is empty.");
        }
        head = head.next;
    }
    
    // delete -last
    
    public void deleteLast(){
        if(head == null){
            System.out.println("The List is empty.");
        }

        // element next to null is also null but the code will break so we need to address this issue.

        if(head.next == null){
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }
    // Print LL

    public static void printList() {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LL list1 = new LL();
        list1.addFirst("nullashwar");
        list1.addFirst("uruguay");
        
        list1.addLast("Aregntina");        
        list1.addLast("Zambia");        
        list1.addLast("Congo");        
        list1.printList();

        list1.deletefirst();
        list1.printList();
        list1.add("KENEA", 2);
        list1.deleteLast();
        list1.printList();
    }
    
}
