package loops;
import java.util.Scanner;
public class c_printOnetoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the input: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println(i);
        }

        
    }
    
}
