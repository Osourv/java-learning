package loops;
import java.util.Scanner;
public class V_reverseOfaNumber {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number: ");
    int n = sc.nextInt();
    int rev=0;

    while(n!=0){ // n>0 is not suitable bcaus -432 is smaller than zero so just print 0. instead use n!=0 is good
        int ld = n%10;
        rev= rev*10+ld;
        n/=10;
      
    }
System.out.println("reverse" +rev);
}    
}
