import java.util.Scanner;
class reverseOOP
{
    int n ;
    void getdata(int i)
    {
    n = i ;

    }

    void putdata()
    {
        int rev = 0;
        while (n > 0)
        {
            rev = (rev*10) + (n % 10);
            n = n /10;
            
        }
        System.out.print(rev);
    }
    public static void main(String args[])
    {
        int m ;
        reverseOOP aa  = new reverseOOP();  // OBJECT
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number: ");
        m = sc.nextInt();
        aa.getdata(m);
        aa.putdata();
    }
}