
import java.util.Scanner;

public class matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of first matrix: ");
        int r1 = sc.nextInt();
        
        System.out.println("Enter the number of columns of first matrix: ");
        int c1 = sc.nextInt();

        System.out.println("Enter the number of rows of second matrix: ");
        int r2 = sc.nextInt();
        
        System.out.println("Enter the number of columns of second matrix: ");
        int c2 = sc.nextInt();

        int m1[][]= new int[r1][c1];
        int m2[][]= new int[r2][c2];
        int result[][]= new int[r1][c2];

        if(c1!=r2){
            System.out.println("Matrix multiplication is not possible");
        }
        else{
            System.out.println("Enter the values of matrix 1: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c1; j++){
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the values of matrix 2: ");
            for(int i=0; i<r2; i++){
                for(int j=0; j<c2; j++){
                    m2[i][j] = sc.nextInt();
                }
            }
            
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                   result[i][j]=0;
                   
                   for(int k=0; k<c1; k++ ){
                    result[i][j]+= m1[i][k] * m2[k][j];
                   }
                }
            }

            System.out.println("The result is: ");
            for(int i=0; i<r1; i++){
                for(int j=0; j<c2; j++){
                    System.out.print(result[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
}
