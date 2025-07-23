package javainput;
import java.util.Scanner;
public class squareofaNumber {
    public static void main(String[] args) {
        //wap to print square of a number
        Scanner sc= new Scanner(System.in);
        System.out.print("enter a number :");

        int x = sc.nextInt();

        int square = x*x;

        System.out.println("the square of a number :"+square);

    
    }
}
