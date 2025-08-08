package loops;
import java.util.Scanner;
public class J_geometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number: ");
        int n = sc.nextInt();
        //1 2 4 8 16 32 64...... upto n terms
        //a = 2,r=ration=2
        int a= 1 , r = 2;
        for(int i = 1; i<=n; i++){
        
        System.out.print(a+ " ");
        a = a*r; 
    }
    }
}
