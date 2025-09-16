import java.util.Scanner;

public class G_starTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // method no->1
        // for(int i =1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(i+j > n)
        //         System.out.print("* ");
        //         else 
        //         System.out.print("  ");
                
        //     }

        //method no ->2

        for(int i = 1; i<=n ; i++){
            for(int j =1; j<=n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
             System.out.println();
        }
            
        
        }
    }

