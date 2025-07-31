import java.util.Scanner;
public class divisibleby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number: ");
        int n = sc.nextInt();

        if(n%5==0 && n%3==0){
            System.out.println("this is divisible by 5or3: ");
        }
        else{
            System.out.println("this is not divisible: ");
        }


    }
}
