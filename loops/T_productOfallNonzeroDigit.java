package loops;
import java.util.Scanner;
public class T_productOfallNonzeroDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a digit: ");
        int n = sc.nextInt();
        int p = 1;

        while(n>0){
            int ld=n%10;
            if(ld!=0){
                p*=ld;
            }
                n/=10;
                System.out.println(p);
            
            
        }

    }
}
