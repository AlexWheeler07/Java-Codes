import java.util.Scanner;

/*Write a JAVA program to create a simple array and access array element.*/
public class p1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter the array elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the index to access: ");
        int index = sc.nextInt();
        if (index >= 0 && index < n) {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Index out of bounds!");
        }
        
    }
}
