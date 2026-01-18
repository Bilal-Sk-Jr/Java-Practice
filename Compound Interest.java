import java.util.Scanner;

public class Compound_Interest {
    public static void main(String[] args){

        //Compound Interest Calculator.

        Scanner input = new Scanner(System.in);

        double FutureVal;
        double PrincipalVal;
        double InterestRate;
        int CompoundYear;
        double Time;

        double Rate;
        double Temp;

        System.out.println("What is the principal value? ");
        PrincipalVal = input.nextDouble();

        while(PrincipalVal <= 0.00){
            System.out.println("Principal Value cannot be negative or zero, try again: ");
            PrincipalVal = input.nextDouble();
        }

        System.out.println("What is the annual interest rate? ");
        InterestRate = input.nextDouble();

        while(InterestRate <= 0.00){
            System.out.println("Interest rate cannot be negative or zero, try again: ");
            InterestRate = input.nextDouble();
        }

        System.out.println("How many times is it compounded in a year? ");
        CompoundYear = input.nextInt();

        while(CompoundYear <= 0.00){
            System.out.println("Compound year cannot be negative or zero, try again: ");
            CompoundYear = input.nextInt();
        }

        System.out.println("How many years is it going to compound for? ");
        Time = input.nextDouble();

        while(Time <= 0.00){
            System.out.println("Time has to be greater than 0, try again: ");
            Time = input.nextDouble();
        }

        Rate = InterestRate/100;
        Temp = (1+(Rate/CompoundYear));

        FutureVal = PrincipalVal * Math.pow(Temp,(Time*CompoundYear));

        System.out.printf("The amount after %.1f years is $%.1f", Time, FutureVal);
    }
}

