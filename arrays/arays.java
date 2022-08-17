package arrays;

public class arays {
    public static void main(String args[]) {
        int[] marks = new int[3];       //defining arrays  or int marks[] = {97 , 57 , 96}
        marks[0] = 97;                  // phy marks
        marks[1] = 57;                  // eng 
        marks[2] = 96;                  // chem

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        for(int i = 0; i<3 ;i++){
            System.out.println(marks[i]);
        }
    }
}
