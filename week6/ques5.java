package week6;

public class ques5 {
    public static void main(String[] args) {
        
        for(int prime = 0; prime < 101 ; prime ++){
        int count = 0;
        for (int i = 1; i < prime+1; i++) {
            if(prime%i ==0){
                count++;
            }
        }
            if(count == 2){
            System.out.println(prime);
            }
        }
        
    }
}
