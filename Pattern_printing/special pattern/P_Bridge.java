import java.util.Scanner;

public class P_Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n-1;i++){//for upper most stars
        System.out.print("* ");
        }
        System.out.println();
         int nsp= 1;
         for(int i=1; i<=n-1;i++){//first triangle stars
            for(int j= 1; j<=n-i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=nsp;j++){//spaces
                System.out.print("  ");
            }
                for(int j =1;j<=n-i; j++){// second triangle stars
                    System.out.print("* ");
                }
                nsp+=2;
                System.out.println();
            }

         }
        } 
    
     