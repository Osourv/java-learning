package Pattern_printing;
import java.util.Scanner;
public class E_numberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j= 1; j<=n; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//output
// enter a number: 
// 4
// 1111
// 2222
// 3333
// 4444
