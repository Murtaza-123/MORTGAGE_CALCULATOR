
import java.text.NumberFormat;
import java.util.Scanner;

class Main{
    public static void main(String[] args)
    {
        byte MONTH_IN_YEAR = 12;
        byte percent = 100;
        int principal = 0;
        float Monthly_Interest = 0;
        int payments = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Principal $1k - $1M: ");
        principal = scanner.nextInt(); 
        if (principal >= 1000 && principal <= 1000000)
            break;
        System.out.println("Enter a number between '1000'and '1000000'");
        }
       while(true){
        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        if(annualInterest >= 1 && annualInterest <=30){
         Monthly_Interest = annualInterest /percent / MONTH_IN_YEAR;
          break;
        }
        System.out.println("Enter the value greater than zero and less than or equal to '30'");
       }
        while(true){
        System.out.println("Time period: ");
        byte years = scanner.nextByte();
        if(years >= 1 && years <=30){
        payments = years * MONTH_IN_YEAR;
        break;
        }
        System.out.println("Enter the value between '1' and '30'");
        }
         double mortgage = principal * (Monthly_Interest * Math.pow(1+Monthly_Interest,payments) /Math.pow(1+Monthly_Interest, payments) - 1 );
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
        
        
        
        
        
