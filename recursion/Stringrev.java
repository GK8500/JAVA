package recursion;

public class Stringrev {
public static void rev(String str , int index ) {
    if(index == 0){
        System.out.print(str.charAt(index));
        return;
    }
    System.out.print(str.charAt(index));
    rev(str , index -1);
    }

    public static void main(String[] args) {
        String str = "abcd";
       rev(str, str.length()-1);
    }
}