import java.util.Scanner; // Import the Scanner class for user input

public class TestProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        double num1, num2, result;
        char operator;

        System.out.println("Enter first number:");
        num1 = scanner.nextDouble(); // Read the first number

        System.out.println("Enter second number:");
        num2 = scanner.nextDouble(); // Read the second number

        System.out.println("Choose an operation (+, -, *, /):");
        operator = scanner.next().charAt(0); // Read the operator character

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            case '/':
                if (num2 != 0) { // Prevent division by zero
                    result = num1 / num2;
                    System.out.println(num1 + " / " + num2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please choose +, -, *, or /.");
        }

        scanner.close(); // Close the scanner
    }
}