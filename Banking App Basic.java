import java.util.Scanner;

public class Banking_App {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double Balance = 0;
        double Amount, WithdrawalAmount;
        int Choice;
        boolean IsRunning = true;

        while(IsRunning == true){
            System.out.println("****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");
            System.out.println("Enter your choice (1-4): ");

            while(input.hasNextInt() == false){
                input.next();
                System.out.println("Has to be a integer number: ");
            }
            Choice = input.nextInt();

            while(Choice != 1 && Choice != 2 && Choice != 3 && Choice != 4){
                System.out.println("Please select a whole number choice from (1-4): ");
                while(input.hasNextInt() == false){
                    input.next();
                    System.out.println("Has to be a integer number: ");
                }
                Choice = input.nextInt();
            }

            switch (Choice){
                case 1 -> ShowBalance(Balance);
                case 2 -> {
                    System.out.println("Enter the amount you want to deposit: ");
                    while(input.hasNextDouble() == false){
                        System.out.println("Amount cannot be anything other than a numeric value");
                        input.next();
                    }
                    Amount = input.nextDouble();
                    while(Amount <= 0){
                        System.out.println("Depost amount must be greater than 0");
                        Amount = input.nextDouble();
                    }
                    Balance = Deposit(Amount, Balance);
                }
                case 3 -> {
                    if (Balance == 0) {
                        System.out.println("No balance to withdraw.");
                        break;
                    }

                    System.out.println("How much do you want to withdraw?: ");
                    while(input.hasNextDouble() == false){
                        System.out.println("Withdrawl amount cannot be anything other than a numeric value");
                        input.next();
                    }

                    WithdrawalAmount = input.nextDouble();

                    while(WithdrawalAmount > Balance || WithdrawalAmount <= 0){
                        System.out.println("Withdrawl amount cannot be greater than the total balance");
                        WithdrawalAmount = input.nextDouble();
                    }

                    Balance = Withdraw(WithdrawalAmount,Balance);
                }
                case 4 -> IsRunning = false;
            }


        }
        input.close();
    }



    static void ShowBalance(double Balance){
        System.out.printf("Your balance is $%.2f\n" , Balance);
    }

    static double Deposit(double Amount, double Balance){
        Balance = Balance + Amount;
        System.out.println("Deposited Successfully!");
        return Balance;
    }

    static double Withdraw(double WithdrawlAmount, double Balance){
        Balance = Balance - WithdrawlAmount;
        System.out.println("Successfully withdrawn");
        return Balance;
    }

}
