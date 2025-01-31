
import java.util.Scanner;

public class binDeciDeciBin {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal equivalent: " + decimal);

        System.out.print("Enter a decimal number: ");
        int decNum = scanner.nextInt();
        String binEquivalent = Integer.toBinaryString(decNum);
        System.out.println("Binary equivalent: " + binEquivalent);

        scanner.close();
    }

}
