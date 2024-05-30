import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Calculator!");
        
        while (true) {
            System.out.println("Choose an operation: ");
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Multiplication");
            System.out.println("4: Division");
            System.out.println("5: Exit");
            
            int choice = scanner.nextInt();
            
            if (choice == 5) {
                System.out.println("Exiting the Calculator. Goodbye!");
                break;
            }
            
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0;
            boolean valid = true;
            
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    valid = false;
                    break;
            }
            
            if (valid) {
                System.out.println("The result is: " + result);
            }
        }
        
        scanner.close();
    }
}
