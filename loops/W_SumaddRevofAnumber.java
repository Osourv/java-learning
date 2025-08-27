package loops;
import java.util.Scanner;
public class W_SumaddRevofAnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum = n,rev = 0;

        while(n!=0){
            int ld=n%10;
            rev= rev*10+ld;
            n/=10;
        }
        sum= sum+rev;
        System.out.println("sum+rev : " +sum );
        System.out.println("sum+rev : " +rev );
    }
}
