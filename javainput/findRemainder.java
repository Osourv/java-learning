package javainput;
import java.util.Scanner;
public class findRemainder {
    public static void main(String[] args) {
        //take two integers input,a and b : a>b,and find the reaminder when a is divided by b.
        Scanner sc = new Scanner(System.in);

        System.out.print("take 1st int :");
        int a = sc.nextInt();

        System.out.print("take 2nd int: ");
        int b = sc.nextInt();
        
        int rem = a % b;
        System.out.println("remainder: " + rem);
        
    }
    
}
