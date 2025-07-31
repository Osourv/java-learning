import java.util.Scanner;
public class findGreatest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int n1 = sc.nextInt();

        System.out.print("enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("enter third number: ");
        int n3 = sc.nextInt();

        if(n1>n2 && n1>n3){
            System.out.println("first number is greatest: " + n1);
        }
        else if(n2>n1 && n2>n3){
            System.out.println("second number is greatest: " + n2);
        }
        else if(n3>n1 && n3>n2){
            System.out.println("third number is greatest:" +n3);
        }
        else{
            System.out.println("no result");
        }
    }

}
