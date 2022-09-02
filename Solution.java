import java.util.Scanner;
import java.lang.Math;
public class Solution{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int n = sc.nextInt();
    double q = 0;
    for(int i = 1;i<=n;i++){
	q =q + a*(Math.pow(2,i-1)*b);
	System.out.print((int)q+" ");
	}	
    sc.close();	
  }
}