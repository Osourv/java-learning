package loops;
import java.util.Scanner;
public class A_BasicOfLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input: ");
        int x = sc.nextInt();


        for(int i = 1; i<=x; i++){
            System.out.println("hello world");
        }
    }
    
}
