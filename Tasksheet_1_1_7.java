import java.util.Scanner;

public class Tasksheet_1_1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double additionResult = add(num1, num2);
        System.out.println("Addition result: " + additionResult);
        double subtractionResult = subtract(num1, num2);
        System.out.println("Subtraction result: " + subtractionResult);
        double multiplicationResult = multiply(num1, num2);
        System.out.println("Multiplication result: " + multiplicationResult);
        double divisionResult = divide(num1, num2);
        System.out.println("Division result: " + divisionResult);
    }
    private static double add(double num1, double num2) {
        return num1 + num2;
    }
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    private static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
    }
}
