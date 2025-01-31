import java.util.Scanner;

/*Write a JAVA program to find sum of even numbers in an integer array.*/
public class p3{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int sum = 0;
        int arr[]= new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                sum=sum+arr[i];
            }
           
        }
         System.out.println("The sum of Even Elements is: "+sum);
    }
}
