import java.util.Scanner;
public class Tasksheet_1_1_4{
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();
        char grade = calculateGrade(score);
        System.out.println("You got " + grade + " grade.");

        scanner.close();
    }
    public static char calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
