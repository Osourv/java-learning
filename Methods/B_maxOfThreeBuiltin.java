package Methods;

import java.util.Scanner;

public class B_maxOfThreeBuiltin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(Math.min(Math.min(a, b),c));
        
    }
}
