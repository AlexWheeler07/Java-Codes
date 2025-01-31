/*1.Write a program to input a 4 digit number and print the even and odd digits and total even and
odd digits
 */

import java.util.*;
public class even_odd_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 4 digit number");
        
        int n = sc.nextInt();
        int c1 = 0;
        int c2 = 0;
        if(n<1000 || n>9999){
            System.out.println("The entered number is out of given range");
        }
        else{
            for(int i=n; i>=1; i=i/10){
                int rem = i%10;
                if(rem%2 == 0){
                    System.out.println("Even digit- "+rem);
                    c1++;
                }
                else{
                    System.out.println("Odd digit- "+rem);
                    c2++;
                }
            }
            System.out.println("The number of even digits = "+c1);
            System.out.println("The number of odd digits = "+c2);

        }
        
    }
}
