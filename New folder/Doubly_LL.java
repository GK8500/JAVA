

public class Doubly_LL {
    Node head;

    private class Node{
        int value;
        Node prev;
        Node next;
    

    Node (int value){
        this.value = value;
    }}

    public void addFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
         }
            head = node;
        
    }


    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + "-->");
            node = node.next;
    }
    System.out.println("END");
}



    public static void main(String[] args) {
        Doubly_LL ll1 = new Doubly_LL();
        ll1.addFirst(5);
        ll1.addFirst(8);
        ll1.addFirst(3);
        ll1.addFirst(4);
        ll1.addFirst(9);
        // System.out.println(ll1);
        ll1.display();
    }



}