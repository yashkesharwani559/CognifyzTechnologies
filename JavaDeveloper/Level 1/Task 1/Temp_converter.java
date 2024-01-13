import java.text.DecimalFormat;
import java.util.Scanner;

// A program in java that converts temperatures between Celsius and Farenheit. Prompt the user to enter a temperature value.

class Temp_converter{
    public static void main(String[] args) {
        
        System.out.println("                  ~~~~~~~~ Program starts ~~~~~~~");

        Scanner sc = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("#.0");

        System.out.print("Enter : \n 1 - If you want to convert the temperature from celsius to Farenheit \n 2 - If you want to convert the temperature from  Farenheit into Celsius: ");

        int choice = sc.nextInt();

        System.out.println("\n");

        if (choice == 1) {
            
            System.out.print("Enter the temperature in celsius: ");
            float celsius = sc.nextFloat();

            System.out.println("");

            double farenheit = celsius * 9 / 5 + 32;

            System.out.println("Temperature in Farenheit is: " + df.format(farenheit));
            
            System.out.println("");
            
        } else if (choice == 2) {

            System.out.print("Enter the temperature in Farenheit: ");

            float farenheit = sc.nextFloat();

            double celsius = (farenheit - 32) * 5 / 9;

            System.out.println("Temperature in Celsius is: " + df.format(celsius));
        
        } else {

            System.out.println("Wrong input! Try again.");

        }

        System.out.println("             ~~~~~Program completed successfully.~~~~~");

        sc.close();

    }
}