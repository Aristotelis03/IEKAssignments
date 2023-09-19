import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--Cinema--");
        Scanner in = new Scanner(System.in);
        int age;
        double ticketPrice = 0;
        double profits = 0;
        int kidsCount = 0;
        int sales = 0;
        int overage = 0 ;
        float press;
        String validation = "y";

        while(Objects.equals(validation, "y")){
            System.out.print("Enter your age: ");
            age = in.nextInt();
            if ((age >= 1) && (age <= 12)) {
                ticketPrice = 8;
                kidsCount++;

            } else if ((age >= 12) && (age <= 65)) {
                ticketPrice = 15;

            } else if (age > 65) {
                ticketPrice = 10;
                overage++;


            }

            sales++;
            profits += ticketPrice;
            press =((float) overage /(float)  sales) * 100;

            System.out.println("TicketPrice: " + ticketPrice);
            System.out.println("Profits: " + profits);
            System.out.println("-Statistics- \nTickets sold to kids: " + kidsCount);
            System.out.println( "Tickets sold in people over 65 years old: " + press + "%");
            System.out.println("-Press x to leave- \n-Press y to continue-");
            validation = in.next().toLowerCase();
        }

        if (Objects.equals(validation, "x")) {
            System.out.println("Program terminating...");
        }



    }
}

