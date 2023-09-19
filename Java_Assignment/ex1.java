import java.util.Scanner;


public class Exercise1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String currency;
        double value = 0;
        double exchangedValue = 0;
         do{
            System.out.println("Choose currency [GBP,USD,RUB,JPY]");
            currency = in.next();
            System.out.println("Enter a value");
            value = in.nextDouble();
        
            switch(currency.toUpperCase()){
                case "GBP":
                    exchangedValue = value * 0.860370 ;
                    System.out.println( exchangedValue + " Euros");
                    break;
                    
                case "USD":
                    exchangedValue = value * 1.133600 ;
                    System.out.println( exchangedValue + " Euros");
                    break;
                    
                case "RUB":
                    exchangedValue = value * 139.908586 ;
                    System.out.println( exchangedValue + " Euros");
                    break;
                    
                case "JPY":
                    exchangedValue = value * 135.122400 ;
                    System.out.println( exchangedValue + " Euros");
                    break;
                    
                default :
                    System.out.println("Invalid currency, try aqgain");
            }
            
           
        }while(value != 0);
        System.out.println("Exit...");
        
    }
    
}
