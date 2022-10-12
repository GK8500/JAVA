// Print the floyde's triangle

public class FloydeTri {
    public static void main(String[] args) {
        int n = 13;
        int x = 1;
        
        for (int i = 1; i <= n;i++) {
            int j = 1;
            // System.out.println(j);                              for debugging 
            while(j <= i){
                System.out.print(x+ " ");
                j++;
                x++;
                
            }
            System.out.println();
            // x ++;
        }
}
}
