package loops;
import java.util.Scanner;
public class K_highestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        int hf = 1;
        for(int i=n-1; i>=1; i--){
            if(n%i==0){//i is a factor of n
                hf=i;
                break; 
 }
     }
     System.out.println(hf);   
        }
             
   }
    

