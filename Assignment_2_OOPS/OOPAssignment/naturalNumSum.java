
import java.util.Scanner;

public class naturalNumSum {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a range: ");
        int n = scanner.nextInt();
        int sum = n * (n + 1) / 2; // Sum of first n natural numbers formula
        System.out.println("Sum of natural numbers up to " + n + " is: " + sum);
        scanner.close();
    }

}
