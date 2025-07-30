import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number :");
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println("this is divisible by 5: " + n);
            System.out.println("good morning");
        }
        else{
            System.out.println("this is not divisible by 5: " + n);
            System.out.println("good evening");
        }
       
 
    }

    
}
