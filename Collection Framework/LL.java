

    public class LL {

        static Node head;
        int size;

        public LL(){
            this.size = 0;
        }

        class Node{
            int value;
            Node next;

            Node(int value){
                this.value = value;
                this.next = null;
            }
            Node(int value,Node next){
                this.value = value;
                this.next = next;
            }

        }


        // add- First
        public void addFirst(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                return;
            }
// We created a new node, then made that node poit to head and then made the new node head.
            newNode.next = head;
            head = newNode; // head gets the new value of newNode.
            size ++;
        }

        // add- Last

        public void addLast(int value){
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
            size ++;
        }

        // add
        public void add(int value, int index){
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            Node n1 = new Node(value, temp.next);
            temp.next = n1;
            size ++;

        }

        // find function
        public Node find(int value){
            Node node = head;
            while(node!=null){
                if(node.value == value ){
                    return node;
                }
                node.next = node;
            }
            return node;
        }

        // get function
        public Node get(int index){
            Node node = head;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        }

        // Delete -First
        public int deletefirst(){
            if(head == null){
                System.out.println("The List is empty.");
            }
            head = head.next;
            return size --;
        }

        // delete -last

        public int deleteLast(){
            if(head == null){
                System.out.println("The List is empty.");
            }

// element next to null is also null but the code will break so we need to address this issue.

            if(head.next == null){
                head = null;

            }

            Node secondlast = head;
            Node lastNode = head.next;
            while(lastNode.next != null){
                lastNode = lastNode.next;
                secondlast = secondlast.next;
            }
            secondlast.next = null;
            return size --;
        }

// delete

        public int delete(int index){

            if(index == 0){
                return deletefirst();
            }
            if(index == size-1 ){
                return deleteLast();
            }

            Node prev = get(index-1);
            int val = prev.next.value;
            prev.next = prev.next.next;

            return val;
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



    public static void main(int[] args) {
        LL list1 = new LL();
        list1.addFirst(2);
        list1.addFirst(3);
        
        list1.addLast(7);        
        list1.addLast(43);        
        list1.addLast(5);        
        list1.printList();

        list1.deletefirst();
        list1.printList();
        list1.add(4323, 2);
        list1.delete(3);
        list1.printList();
    }
    
}
