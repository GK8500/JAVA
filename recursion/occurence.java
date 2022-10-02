//  Print the first and last occurence of an alphabet using recursion

package recursion;

// public class occurence {
//     public static void main(String[] args) {

//         String str = "aahhssaaajah";
//         int first = -1;
//         int last = -1;
//         for (int i = 0; i < str.length(); i++) {
//             if(str.charAt(i) == 'a'){
//                 if(first == -1){
//                     first = i;
//                 }
//                 else{
//                     last = i;
//                 }
//             }

//         }
//         System.out.println(first);
//         System.out.print(last);
//     }
    
// }

public class occurence{
    public static int first = -1;
    public static int last = -1;

    public static void occur(String str , int indx) {
        
        if(str.length() == indx){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(indx) == 'a'){
            if(first == -1){
                first = indx;
            }
            else{
                last = indx;
            }
        }
        occur(str, indx+1);
    }

    public static void main(String[] args) {
        String str = "aasjdhsjajhjahfu";
        occur(str, 0);
    }
}