import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("enter the number:");
        int num = Sc.nextInt();
        

        if(num%2==0){
            System.out.println("this is even :" + num);
        }
        else{
            System.out.println("this is odd : " + num);
        }

 
        
    }
    
}
