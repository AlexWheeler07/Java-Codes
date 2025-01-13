import java.util.Scanner;

public class alt_space_diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        //for upper half
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
              }
              
            for(int j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
              System.out.println();
            }

            //for lower half
            for(int i=n; i>=1; i--){
            
                for(int j=1; j<=n-i; j++){
                    System.out.print(" ");
                  }
                  
                for(int j=1; j<=i; j++){
                    System.out.print("*"+" ");
                }
                  System.out.println();
                }
        }
    }

