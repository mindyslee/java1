import java.util.Scanner;

class MortgageCalculator {

    public static void main (String[] args) {
        //declare variables
        Scanner sc = new Scanner(System.in);
        double p = 0;   //principle
        double r = 0;   //rate
        double n = 0;   // # of years
        double i = 0;   //interest
        
        //get user input
        System.out.println("Investment Calculator");
        System.out.println("--------------------");
        System.out.println("");
        System.out.print("Enter the investment's principle amount in dollars: $");
        p = sc.nextDouble();
        System.out.print("Enter the investment's interest rate (between 0 and 1): ");
        r = sc.nextDouble();
        System.out.print("Enter the number of years the investment will accumulate wealth: ");
        n = sc.nextDouble();

        //calculate and display interest
        i = p * Math.pow(1+r,n);
        System.out.println("This investment will be worth $" + i + " after " + n + " years.");
    }
}
