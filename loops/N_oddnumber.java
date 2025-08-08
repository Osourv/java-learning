package loops;
import java.util.Scanner;
public class N_oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=100; i++){
            if(i%2==0)continue;
            System.out.println("hello");
            System.out.println(i);
            //o
            
        }
        
    }
}
