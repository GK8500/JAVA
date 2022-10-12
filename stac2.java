class stac2
{
    static int arr[];
 static int top;
    static int capacity;
 
    static void  Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
    }
 

   static void push(int x)
    {
        if (top==capacity)
        {
            System.out.println("Overflow");
            
        }
 
        System.out.print(" " + x);
        System.out.println(" ");
        arr[++top] = x;
    }
 
  
   static int pop()
    {
        
        if (top==-1)
        {
            System.out.println("Underflow\nProgram Terminated");
           
        }
       
        System.out.println("Removing " + peek());
 
        
        return arr[top--];
    }
  static int peek()
    {
        if (top!=-1) {
            return arr[top];
        }
        
 
        return -1;
    }


    public static void main(String args[]){
        Stack(6);
        System.out.println("The stack elements are: ");
 
        push(1);      
        push(2);
        push(4);
        push(5);
        push(6);
        System.out.println("now removing first two elements: ");
              
 
        pop();        
        pop();       
 
          

      
        System.out.println("The top element is " + peek());

}
}