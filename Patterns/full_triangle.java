import java.util.Scanner;
public class full_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int m=1; m<=i-1; m++){
                System.out.print("*");
            }
            
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
