/*Write a function which takes in 2 numbers and returns the greater of those two. */

import java.util.Scanner;

class greaterOf2{
    public static void greaterOF2(int a, int b){
        if(a>b){
            System.out.println("1st number is greater");;
        }
            else if(a<b){
                System.out.println("2nd number is greater");
            }
            else 
            System.out.println("Both are equal");
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the first num:");
            int a = sc.nextInt();

            System.out.println("Enter the second num:");
            int b = sc.nextInt();

            greaterOF2(a,b);

        }
    }
