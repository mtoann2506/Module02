import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0.Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter temperature in Celsius: ");
                    celsius = sc.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
                    break;
                case 2:
                    System.out.println("Enter temperature in Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
            }

        } while (choice != 0);
    }
}
