package loops;
import java.util.Scanner;
public class S_productOfDigit {
    public static void main(String[] args) {
        System.out.print("enter a digit: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;

        while(n!=0){
            int lastdigit = n%10;
            product*=lastdigit;
            n/=10;
            System.out.println(product);
        }
        
        

    }
}
