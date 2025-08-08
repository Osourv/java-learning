package loops;
import java.util.Scanner;
public class L_primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();

        boolean flag = false; // false means prime
        for(int i=2; i<n; i++){
            if(n%i==0){ // i is a factor of n
                flag = true; // true means composite
                break;
            }
        }

        if(n==1)System.out.println("neither prime nor composite");
        else if(flag==false)System.out.println("prime");
        else System.out.println("composite");
    }
}
