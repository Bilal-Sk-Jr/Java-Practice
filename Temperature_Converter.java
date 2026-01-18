import java.util.Scanner;

public class Temperature_Converter{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            char Choice = ' ';
            double Temp = 0;
            String UserIn;

            System.out.println("Enter the temperature in Celcius or Fahrenheit: ");

            while(input.hasNextDouble() == false){
                System.out.println("Must be a decimal number: ");
                input.next();
            }
            Temp = input.nextDouble();

            while(true){
                System.out.println("Convert temperature to Celsius or Fahrenheit? (C or F): ");

                if(input.hasNext()){
                    UserIn = input.next();

                    if(UserIn.length() == 1){
                        Choice = UserIn.charAt(0);
                        Choice = Character.toUpperCase(Choice);

                        if(Choice == 'C' || Choice == 'F'){
                            break;
                        }
                    }
                }
                System.out.println("Invalid input. Only C or F is allowed");
            }

            if(Choice == 'C'){
                Temp = (Temp - 32.0) * (5.0/9.0);
                System.out.printf("Temperature in Celsius is: %.2f", Temp);
            }
            else{
                Temp = (Temp * (9.0/5.0)) + 32.0;
                System.out.printf("Temperature in Fahrenheit is: %.2f", Temp);
            }

            input.close();

        }
}
