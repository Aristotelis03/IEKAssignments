
import java.time.Year;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] taxList = new double[10];
        int[] yearList = new int[10];

        for (int i=0; i <= taxList.length-1; i++) {

            System.out.println("Enter the displacement of the Car NO." + (i+1));
            double displacement = in.nextDouble();
            System.out.println("Enter year of manufacture of your car ");
            int myear = in.nextInt();
            double tax = 0;


            if ((displacement >= 0) && (displacement <= 1100)) {
                tax = 110;

            } else if ((displacement >= 1101) && (displacement <= 1400)) {
                tax = 150;

            } else if ((displacement >= 1401) && (displacement <= 2000)) {
                tax = 225;

            } else if (displacement > 2000) {
                tax = 600;

            } else {
                System.out.println( "invalid value");
            }



            if (Year.now().getValue() - myear <= 3) {

                tax = tax / 1.05;

            }
            taxList[i] = tax;
            yearList[i] = myear;


        }

        for (int i=0; i <= taxList.length-1; i++){

            System.out.println("******************************");
            System.out.println("NO." + (i+1) + " tax is " + taxList[i]);
            if (Year.now().getValue() - yearList[i]  <= 3) {
                System.out.println("You have 5% tax discount");


            } else {
                System.out.println( "invalid year");
            }
        }
        System.out.println("******************************");
    }


}
