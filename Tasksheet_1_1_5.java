import java.util.Scanner;
public class Tasksheet_1_1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }
    private static boolean isPalindrome(String input) {
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        // Check if the input string and reversed string are the same
        return input.equals(reversedString.toString());
    }
}
