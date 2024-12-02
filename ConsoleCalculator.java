import java.util.Scanner;

public class ConsoleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display the menu
            System.out.println("\n=== Console-Based Calculator ===");
            System.out.println("1. Basic Arithmetic Operations");
            System.out.println("2. Scientific Calculations");
            System.out.println("3. Unit Conversions");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            // Get the user's choice
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performBasicArithmetic(scanner);
                    break;
                case 2:
                    performScientificCalculations(scanner);
                    break;
                case 3:
                    performUnitConversions(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Basic arithmetic operations
    private static void performBasicArithmetic(Scanner scanner) {
        System.out.println("\n--- Basic Arithmetic Operations ---");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operation. Please try again.");
                return;
        }
        System.out.println("Result: " + result);
    }

    // Scientific calculations
    private static void performScientificCalculations(Scanner scanner) {
        System.out.println("\n--- Scientific Calculations ---");
        System.out.println("1. Square Root");
        System.out.println("2. Exponentiation");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double number = scanner.nextDouble();
                if (number >= 0) {
                    System.out.println("Square root: " + Math.sqrt(number));
                } else {
                    System.out.println("Error: Cannot calculate the square root of a negative number!");
                }
                break;
            case 2:
                System.out.print("Enter the base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the exponent: ");
                double exponent = scanner.nextDouble();
                System.out.println("Result: " + Math.pow(base, exponent));
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
    // Unit conversions
    private static void performUnitConversions(Scanner scanner) {
        System.out.println("\n--- Unit Conversions ---");
        System.out.println("1. Temperature (Celsius to Fahrenheit)");
        System.out.println("2. Currency (USD to EUR)");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                break;
            case 2:
                System.out.print("Enter amount in USD: ");
                double usd = scanner.nextDouble();
                // Example conversion rate, 1 USD = 0.85 EUR
                double eur = usd * 0.85;
                System.out.println("Amount in EUR: " + eur);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }
