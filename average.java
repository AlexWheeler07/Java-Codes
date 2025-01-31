/* Enter 3 numbers from the user & make a function to print their average. */

import java.util.*;

class average{
    public static void average(int a,int b,int c){
        System.out.println("The average is: "+((a+b+c)/3.0));
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        System.out.println("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Enter the third number: ");
        int c = sc.nextInt();

        average(a,b,c);


    }
}