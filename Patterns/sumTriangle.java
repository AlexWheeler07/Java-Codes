import java.util.Scanner;

public class sumTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        
        for(int i=0; i<=n; i++){
         
            for(int j=0; j<=n-i-1; j++){
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 0; j <=i; j++) {
                System.out.print(number + " ");
                // Calculate the next number in the row
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    
}
