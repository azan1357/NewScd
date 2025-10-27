
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        System.out.println("Simple Calculator");
        System.out.println("-----------------");

        while (running) {
            System.out.println("\nChoose an operation:");
            System.out.println("1) Add (+)");
            System.out.println("2) Subtract (-)");
            System.out.println("3) Multiply (*)");
            System.out.println("4) Divide (/)");
            System.out.println("5) Modulus (%)");
            System.out.println("6) Power (^)");
            System.out.println("0) Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number for the menu choice.");
                continue;
            }

            if (choice == 0) {
                running = false;
                System.out.println("Goodbye!");
                break;
            }

            System.out.print("Enter first number: ");
            double a;
            try {
                a = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            System.out.print("Enter second number: ");
            double b;
            try {
                b = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Try again.");
                continue;
            }

            double result;
            switch (choice) {
                case 1:
                    result = a + b;
                    System.out.printf("Result: %.6f\n", result);
                    break;
                case 2:
                    result = a - b;
                    System.out.printf("Result: %.6f\n", result);
                    break;
                case 3:
                    result = a * b;
                    System.out.printf("Result: %.6f\n", result);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero is undefined.");
                    } else {
                        result = a / b;
                        System.out.printf("Result: %.6f\n", result);
                    }
                    break;
                case 5:
                    if (b == 0) {
                        System.out.println("Error: Modulus by zero is undefined.");
                    } else {
                        result = a % b;
                        System.out.printf("Result: %.6f\n", result);
                    }
                    break;
                case 6:
                    result = Math.pow(a, b);
                    System.out.printf("Result: %.6f\n", result);
                    break;
                default:
                    System.out.println("Invalid choice. Choose a number from the menu.");
            }
        }

        sc.close();
    }
}
