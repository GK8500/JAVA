import java.util.Scanner;

public class assignment {
    public static void main(String  args[]) {
      Scanner sc  = new Scanner(System.in);
        int strings = 0;
        int spaces = 0;
        int numbers = 0;

        String sen = sc.nextLine();

        for(int i = 0 ; i < sen.length(); i ++) {
            int ascii =  sen.charAt(i);

            if(ascii == 32) {
              spaces += 1;
            }

            else if(ascii >= 48 && ascii <= 57) {
              numbers += 1;
            }
            else {
              strings += 1;
            }

        }
        System.out.println("The sentence has " + strings + " letters, " + numbers + " numbers and " + spaces + " spaces.");
        sc.close();
    
}
}

    
    
    
