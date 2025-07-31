import java.util.Scanner;
public class divisileby5or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number:");
        int n = sc.nextInt();
        
        if(n%5==0 || n%3==0){ // code run n%5 if this wrong run n%3 
            System.out.println("the no is divisible 5 or 3");
        }
        else{
            System.out.println("not divisible by 5or3");
        }
    }
}
