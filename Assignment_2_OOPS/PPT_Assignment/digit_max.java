/*2.Write a program to input a 10 digit number and find the digit with maximum value. */
import java.util.*;

public class digit_max {
    public static void main(String[] args) {
        

     Scanner sc = new Scanner(System.in);

    System.out.println("Enter a 10 digit number: ");
    double n = nextDouble();

    if(n<1000000000 || n>9999999999){
        System.out.println("The entered number is out of range.");
    }
    else{
        int rem = 0;
        for(int i=n; i>=1; i=i/10){
            rem = n%10;
            
        }
    }
    }
    
}
