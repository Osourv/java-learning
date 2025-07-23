package javainput;
import java.util.Scanner;
public class sumof2numbersInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      // in java the code run line by line 
        System.out.print("enter the first number :");
        int x = sc.nextInt();

        System.out.print("enter the second number :");
        int y = sc.nextInt();

        int sum = x+y;
        System.out.println("sum :"+sum);
    
     }
}
