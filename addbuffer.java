// Taking inputs through buffered reader class 

import java.io.*;
class addbuffer{
    public static void main(String args[])throws IOException
    {
    int a , b , sum ;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter First Number: ");
    a = Integer.parseInt(br.readLine());                // Float.parseFloat(bt.readLine());
    System.out.println("enter second number: ");
    b = Integer.parseInt(br.readLine());
    sum=a+b;
    System.out.println("Addition = " + sum);

    }
}

