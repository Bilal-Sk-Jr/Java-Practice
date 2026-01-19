import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double Num1,Num2,Result = 0;
        char Operator;
        String UserIn;

        System.out.println("Enter the first number: ");
        while(input.hasNextDouble() == false){
            System.out.println("Must be a number: ");
            input.next();
        }
        Num1 = input.nextDouble();

        while(true){
            System.out.println("Enter an operator (+, -, *, /, ^): ");
            if (input.hasNext()){
                UserIn = input.next();

                if(UserIn.length() == 1){
                    Operator = UserIn.charAt(0);

                    if(Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/' || Operator == '^'){
                        break;
                    }
                }
            }
            System.out.println("Please enter a valid operator: ");

        }

        System.out.println("Enter the second number: ");
        while(input.hasNextDouble() == false){
            System.out.println("Must be a number: ");
            input.next();
        }
        Num2 = input.nextDouble();


        /*while(Num2 == 0 && Operator == '/'){
            System.out.println("Cannot divide by 0! Enter another second number: ");
            Num2 = input.nextDouble();
        }
        */


        switch(Operator){
            case '+' -> Result = Num1 + Num2;
            case '-' -> Result = Num1 - Num2;
            case '*' -> Result = Num1 * Num2;
            case '/' -> {
                while(Num2 == 0 && Operator == '/'){
                    System.out.println("Cannot divide by 0! Enter another second number: ");
                    Num2 = input.nextDouble();
                }
                Result = Num1 / Num2;
            }
            case '^' -> Result = Math.pow(Num1, Num2);
        }

        System.out.printf("Your result is: %.2f" , Result);
        input.close();

    }
}

