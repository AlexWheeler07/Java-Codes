

import java.util.Scanner;

public class OddSum {
    public static void OddSum(int n) {
        int sum=0;

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum+=i;
            }
        }
        
        System.out.println("The sum of odd numbers: "+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        OddSum(n);
    }
    
}
