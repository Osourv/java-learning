import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("enter the number:");
        int num = Sc.nextInt();
        
        // == ka mtlb equal to , != ka mtlb not equal to.
        if(num%2==0){  // num even hai
            System.out.println("this is even :" + num);
        }
        else{  // num odd hai
            System.out.println("this is odd : " + num);
        }

 
        
    }
     
}
