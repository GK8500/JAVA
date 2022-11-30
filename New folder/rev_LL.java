public class rev_LL {
    static Node head;

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // add- First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
// We created a new node, then made that node poit to head and then made the new node head.
        newNode.next = head;
        head = newNode; // head gets the new value of newNode.

    }

    // add- Last

    public void addLast(String data){
        Node newNode = new Node(data);
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

    public void printList() {
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //revserse 

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){   // we are now at the last node
            Node nextNode = currNode.next; 
            currNode.next = prevNode;
// updates or moves the list up by 1.
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    Node reverseRecursive(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        rev_LL list1 = new rev_LL();
        list1.addFirst("nullashwar");
        list1.addFirst("uruguay");
        
        list1.addLast("Aregntina");        
        list1.addLast("Zambia");        
        list1.addLast("Congo");        
        list1.printList();
        list1.reverseRecursive(head);
        list1.printList();
        
    }
    
}
