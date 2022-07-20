// first program
// JAVA is a pure object oriented language so every program starts with defining a class 

class Basic
{
    public static void main (String[] args)
    {
        System.out.println("Hello world");  // println sends the cursor to a new line but print will continue the next sentence from the same line

        System.out.print("This is java programming  ");
        System.out.println("It is based on OOP");

        int a , b;
        a = 5;
        b = 10;
        System.out.println("Value of a = " +a);
        System.out.println(b);
        System.out.println("or");
        System.out.println("Value of a = " + a + " and value of b = "+b);
        System.out.println(b);
        System.out.println("or");
        System.out.println("Value of a = " + a + "\nvalue of b = "+b);
        // \n is used to go to the next line within string
    }
    
}