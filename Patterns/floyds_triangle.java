
import java.util.*;

public class floyds_triangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        int number=1;

        //outer loop
        for(int i=1; i<=n; i++)
        {
            //inner loop
            for(int j=1; j<=i; j++)
            {
                System.out.print(number+" ");
                number++;  //number = number+1
            }
            System.out.println();
        }
    }
    }

