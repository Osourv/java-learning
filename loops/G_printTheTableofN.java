package loops;
import java.util.Scanner;
public class G_printTheTableofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the table number: ");
         int n = sc.nextInt();
        // using if-else
        //  for(int i=1;i<=10; i++){
        //     if(i<=10){
        //         System.out.println(n*i);
        //     }
        //  }
        

        //using increment changes
        for(int i=1;i<=10; i+=1){
         System.out.println(n*i);

    }
}
}
