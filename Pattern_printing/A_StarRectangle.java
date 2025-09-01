package Pattern_printing;
import java.util.Scanner;
public class A_StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row: ");
        int row = sc.nextInt();
        System.out.println("enter column: ");
        int col = sc.nextInt();

        for(int i=1; i<=row; i++ ){ //kitna lines hogi
            for(int j=1;j<=col;j++){ // har line me kitna print hoga *
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
