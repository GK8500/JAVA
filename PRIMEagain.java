public class PRIMEagain {
    public static void main(String[] args) {
        
        int[] arr = new int[100];
        for (int i = 1; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
                continue;
            }
                if(count == 2){
                    System.out.print(i + " ");
                    // for (int k = 0; k < arr.length; k++) {
                    //     arr[k] = i; 
                       
                    // }
                    
                }
                
                }
            //     for (int k = 0; k < arr.length; k++) {
            //         System.out.print(arr[k] + " ");
            // }
            
        }
    }

