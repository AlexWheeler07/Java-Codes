
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice 1 for addition");
        System.out.println("Enter choice 2 for subtraction");
        System.out.println("Enter choice 3 for multiplication");
        System.out.println("Enter choice 4 for division");
        System.out.println("Enter choice");
        int ch = sc.nextInt();

        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();

        switch(ch){
            case 1:
            System.out.println(a+b);
            break;
            case 2:
            System.out.println(a-b);
            break;
            case 3:
            System.out.println(a*b);
            break;
            case 4:
                if(b != 0)
                System.out.println((float)a/b);
                else
                System.out.println("Unable to divide as denominator is 0");
                break;
            default:
            System.out.println("Invalid choice");
        }
        
    }
}
