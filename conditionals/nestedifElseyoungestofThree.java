import java.util.Scanner;
public class nestedifElseyoungestofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("age of ram: ");
        int r = sc.nextInt();

         System.out.println("age of shyam: ");
        int s = sc.nextInt();

         System.out.println("age of ajay: ");
        int a = sc.nextInt();

        if(r<s){ //if r<s then if run. r>s then if condition not running and else run ,
            if(r<a){ // r>a then if not run. nested else run
                System.out.println("ram is youngest:" +r);
            }
            else{
                System.out.println("ajay is youngest:" +a);
            }
        }
        else{ //r>s
            if(s<a){ //s>a the else run
                System.out.println("shyam is youngest:" +s);
            }
            else{
                System.out.println("ajay is youngest:" +a);
            }
        }

    }
}
