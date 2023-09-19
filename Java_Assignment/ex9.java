import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to find: ");
        int toFind = in.nextInt();
        int[] myArray = {10,65,32,76,42,12,56,75,32,98};

        boolean found = IntStream.of(myArray).anyMatch(n -> n == toFind);
        if(found){
            System.out.println(toFind + " is found.");
        }else{
            System.out.println(toFind + " is not found.");
        }
    }
}
