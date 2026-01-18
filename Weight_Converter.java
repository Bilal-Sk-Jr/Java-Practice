import java.util.Scanner;

public class Weight_Converter {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int Choice;
        double Weight;
        double Kg;
        double Lbs;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");
        System.out.println("Choose an option: ");

        while(input.hasNextInt() == false){
            System.out.println("Please enter either 1 or 2");
            input.next();
        }

        Choice = input.nextInt();

        while(Choice != 1 && Choice != 2){
            System.out.println("Please enter either 1 or 2: ");

            while(input.hasNextInt() == false){
                System.out.println("Please enter a valid numeric choice");
                input.next();
            }

            Choice = input.nextInt();
        }

        if(Choice == 1){
            System.out.println("Enter weight in lbs: ");

            while(input.hasNextDouble() == false){
                System.out.println("Please enter a numeric weight!");
                input.next();
            }

            Weight = input.nextDouble();

            while (Weight <= 0 || Weight > 1000000){
                System.out.println("Weight must be between 0 and 1,000,000. Enter correct weight: ");

                while(input.hasNextDouble() == false){
                    System.out.println("Weight has to be numeric!");
                    input.next();
                }

                Weight = input.nextDouble();
            }

            Kg = Weight / 2.205;
            System.out.printf("The weight in kg is: %.2f\n", Kg);
        }

        else{
            System.out.println("Enter weight in kg: ");

            while(input.hasNextDouble() == false){
                System.out.println("Please enter a numeric weight!");
                input.next();
            }

            Weight = input.nextDouble();

            while (Weight <= 0 || Weight > 1000000){
                System.out.println("Weight must be between 0 and 1,000,000. Enter correct weight: ");

                while(input.hasNextDouble() == false){
                    System.out.println("Please enter a numeric weight!");
                    input.next();
                }

                Weight = input.nextDouble();
            }

            Lbs = Weight * 2.205;
            System.out.printf("The weight in lbs is: %.2f\n", Lbs);

        }

        input.close();

    }
}
