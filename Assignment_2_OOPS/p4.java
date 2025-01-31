
import java.util.Scanner;

/*Write a Java program to calculate sum of two 2D arrays.*/
public class p4{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of 2D array: ");
        int m=sc.nextInt();
        int sum = 0;
        
        
        System.out.println("Enter the number of columns of 2D array: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];
        int arr1[][]= new int[m][n];

       


        System.out.println("Enter the 1st array elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }
        }

        System.out.println("Enter the 2nd array elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr1[i][j] = sc.nextInt();
        }
        }

       System.out.println("The sum of 1st and 2nd array is: ");
       
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            System.out.print(arr[i][j] + arr1[i][j]+" ");
        }
        System.out.println();
        }
        
    }
}
