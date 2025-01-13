
import java.util.*;

public class right_half_pyramid {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++)
        {
            for(int j=1; j<=r-i; j++)
            {
                System.out.print(" "); 
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
