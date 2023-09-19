import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        int min = Integer.MAX_VALUE;;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        float average = 0;
        for(int i =1; i<= 10; i++) {
            System.out.println("Enter the #"+ i +"number");
            num = in.nextInt();
            sum += num;

            if(num <= min){
                min = num;

            } else if (num >= max) {
                max = num;
            }

        }

        average = (float) sum / 10;
        System.out.println("The maximus number is: "+max);
        System.out.println("The minimum number is: "+min);
        System.out.println("The sum is: "+sum);
        System.out.println("The average is: "+average);
    }
}
