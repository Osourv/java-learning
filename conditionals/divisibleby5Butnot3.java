import java.util.Scanner;
public class divisibleby5Butnot3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();

        if(n%5==0 && n%3!=0){
            System.out.println("divisible by 5");
        }
        else {
            System.out.println("hello");
        }
        
        }
    }

