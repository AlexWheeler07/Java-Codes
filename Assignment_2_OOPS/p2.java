import java.util.Scanner;

/*Write a JAVA program to create a 2D array and access array element.*/
public class p2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();

        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();
        int arr[][]= new int[m][n];

        System.out.println("Enter the array elements: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr[i][j] = sc.nextInt();
        }
        }
       System.out.println("The array elements are: ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            System.out.println("Element at: "+i+" row and "+j+" column is: "+arr[i][j]);
        }
        }
    }
}
