import java.util.Scanner;

public class O_Diamond {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    //this is for pyramid
    int nsp=n-1, nst=1;

    for(int i = 1; i<=n; i++){
        for(int j = 1; j<=nsp; j++){
            System.out.print("  ");
        }
        for(int j = 1; j<=nst; j++){
            System.out.print("* ");
        }
        nsp --;
        nst +=2;
        System.out.println();

    }
    //this is for below the pyramid
    nsp  = 1;
    nst = 2*n-3;

    for(int i= 1; i<=n; i++){
        for(int j = 1; j<=nsp; j++){
            System.out.print("  ");
        }
        for(int j = 1; j<=nst; j++){
            System.out.print("* ");
        }
        nsp++;
        nst-=2;
        System.out.println();
    }

   }
}