import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        int x = sc.nextInt();

//         if( x%5==0 || x%3==0){
//             if(x%15!=0){
//                 System.out.println("this is divisible by 5 or 3 but not by 15: " +x);
//             }
//             else{
//                 System.out.println("this is divisible by 15");
//             }
//         }
//         else{
//             System.out.println("this is invalid: " +x);
//         }
//     }
// }
if((x%5==0 || x%3==0) && x%15!=0){
    System.out.println("the no is divisible by 5or3 but not by 15");
}
else{
    System.out.println("not matched the required condition");
}



    }
}