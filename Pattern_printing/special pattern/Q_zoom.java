import java.util.Scanner;

public class Q_zoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
               // System.out.print(Math.min(i,j));
               if(i<j){
                System.out.print(i);
               }
               else{
                System.out.print(j);
               }
            }
            System.out.println();
        }
    }
}
