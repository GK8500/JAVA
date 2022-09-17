// reutn the number of numbers and their sum divisible by 7 between 100 and 200

public class intbtw100 {
    public static void main(String[] args) {
        int sum = 0;
        int j = 0;
        for (int i = 100; i <= 200; i++) {
            if(i % 7 ==0){
                j++;
                sum = sum + i;
            }
        }
        System.out.println(sum);
        System.out.println(j);
}
}
