import java.util.Scanner;
public class Tasksheet_1_1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String input = scanner.nextLine();
        processInput(input);
    }
    private static void processInput(String input) {
        String[] numbersAsString = input.split("\\s+");
        int[] numbers = new int[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersAsString[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + numbersAsString[i].trim() + " is not a valid integer.");
                return; // Exit the program if there's an invalid input
            }
        }
        int[] cumulativeSums = cumulativeSum(numbers);
        System.out.println("Cumulative sums:");
        for (int i = 0; i < cumulativeSums.length; i++) {
            System.out.println("Cumulative sum for parameter " + (i + 1) + ": " + cumulativeSums[i]);
        }
    }
    private static int[] cumulativeSum(int... numbers) {
        int[] cumulativeSums = new int[numbers.length];

        int currentSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            currentSum += numbers[i];
            cumulativeSums[i] = currentSum;
        }

        return cumulativeSums;
    }
}
