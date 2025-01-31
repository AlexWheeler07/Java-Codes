
/*Write a Java program to calculate sum of two 2D arrays.*/
import java.util.Scanner;


public class p5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of 2D array: ");
        int m=sc.nextInt();
        int sum = 0;
        
        int max_row, max_col;
        System.out.println("Enter the number of columns of 2D array: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        

        System.out.println("Enter the array elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }
        }

        
       System.out.println("The sum of diagonal elements of the array is: ");
       
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
             if(i == j){
                sum=sum+arr[i][j];
             }
        }
        
        }
        System.out.println(sum);
        
    }
}
