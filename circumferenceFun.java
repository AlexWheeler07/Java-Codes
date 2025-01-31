import java.util.Scanner;

public class circumferenceFun {
    public static void circum(float r){
        float rad = (22/7)*r*r;
        
        System.out.println("The circumference of the circle is: "+rad);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        float r = sc.nextFloat();

        circum(r);

    }
}
