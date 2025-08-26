package loops;
import java.util.Scanner;
public class U_SumOfAllTheEvenDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a digit: ");
        int n = sc.nextInt();
        int sum = 0;

        while(n>0){
            int ld=n%10;
            if(ld%2==0){
                sum+=ld;
            }
            n/=10;
            

            }
            System.out.println("sum of all the even digit: " +sum);
        }


    }

