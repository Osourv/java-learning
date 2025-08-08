package loops;
import java.util.Scanner;
public class I_arithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = sc.nextInt();

        //1 3 5 7 9    2n-1
        for(int i = 1; i<=2*n-1; i+=2){
            System.out.print(i+" ");
        }

        //method 2 -> 3,7 ,11, 15 .....(not using the formula). d is difference 
        int a = 3  , d = 4;
        for(int i = 1; i<=n; i++){
            System.out.println(a+" ");
            a += d;
        } 

        
    }
}
