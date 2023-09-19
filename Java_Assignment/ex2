import java.util.Scanner;


public class Exercise2 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String dest;
        int seats = 0;
        String transp;
        double price = 0;

        int italyTripsIncome = 0;
        double airSumPrice = 0;
        
        do{
        
        System.out.println("Enter the number of the seats");
        seats = in.nextInt();    
        System.out.println("Choose destination, press: \nI for Italy\nC for Cyprus\nT for Turkey");
        dest = in.next();
        System.out.println("Select the mean of transport, pres: \n A for Airplane \n S for Ship");
        transp = in.next().toUpperCase();
        
       
        switch(dest.toUpperCase()) {

            case "I":
                System.out.println("Destination: Italy");
                
                if("A".equals(transp)){
                    price = 300 * seats;
                    airSumPrice += price;
                } else if("S".equals(transp)){
                    price = 200 * seats;
                }
                italyTripsIncome += price;
                System.out.println("*The price for " + seats + " seats is " + price + " euros");
                break;
                    
            case "C":
                System.out.println("Destination: Cyprus");

                if("A".equals(transp)){
                    price = 350 * seats;
                    airSumPrice += price;                    
                } else if("S".equals(transp)){
                    price = 250 * seats;
                }
                    System.out.println("*The price for " + seats + " seats is " + price + " euros");              

                break;

            case "T":
                System.out.println("Destination: Turkey");
                if("A".equals(transp)){
                    price = 250 * seats;
                    airSumPrice += price;                    
                } else if("S".equals(transp)){
                    price = 150 * seats;
                }
                    System.out.println("*The price for " + seats + " seats is " + price + " euros");
                break;

            default :
                System.out.println("Invalid destination, try aqgain");

        }
        }while(seats != 0);
        
        
        System.out.println("The total summ of airplane tickets is " + airSumPrice);
        System.out.println("We sold " + " tickets for trips to tickets is " + italyTripsIncome);
        System.out.println("Exit...");
        
    }
    
}
