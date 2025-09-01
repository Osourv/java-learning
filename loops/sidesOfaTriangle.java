package loops;
import java.util.Scanner;
public class sidesOfaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first side: ");
        int a = sc.nextInt();

        System.out.println("enter the second side: ");
        int b = sc.nextInt();

        System.out.println("enter the third side: ");
        int c = sc.nextInt();

        if(a+b>c && b+c>a && c+a>b){
            System.out.println("all sides are of a triangle ");
        }
        else{
            System.out.println("invalid triangle");
        }
    }
}
