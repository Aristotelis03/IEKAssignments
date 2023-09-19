import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;



public class Ex10 {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int[] numArray = {10,32,28,65,45,67,87,93,19,4};
        int[] numArray_new = new int[numArray.length-1];
        System.out.println("Enter a number");
        int toFind = in.nextInt() ;
        boolean found = IntStream.of(numArray).anyMatch(n -> n == toFind);       

        if(found){
          System.out.println(toFind + " is found.");
        }else{
          System.out.println(toFind + " is not found.");
        }
 
        for(int i=0, k=0;i<numArray.length;i++){
        if(numArray[i] != toFind) {
            numArray_new[k] = numArray[i];
            k++;
            
            }
        }
                System.out.println("Before deletion :" + Arrays.toString(numArray));
        System.out.println("After deletion :" + Arrays.toString(numArray_new));
        
        
    }
}
