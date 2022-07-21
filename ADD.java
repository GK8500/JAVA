import java.util.Scanner;
class ADD
{
    int a , b ;// class variable
    void getdata()
    {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("Give thw first number: ");
        a = sc.nextInt();
        System.out.println("Give thw second number: ");
        b = sc.nextInt();       
    }
    void putdata()
    {
        System.out.print("Addition = " + (a + b));
    }
    public static void main(String args[])
    {
        ADD aa = new ADD();  // calling ADD class
        aa.getdata();  // takes input of the numbers
        aa.putdata();  // adds the numbers
    }
}