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

        if(r<s){
            if(r<a){
                System.out.println("ram is youngest:" +r);
            }
            else{
                System.out.println("ajay is youngest:" +a);
            }
        }
        else{
            if(s<a){
                System.out.println("shyam is youngest:" +s);
            }
            else{
                System.out.println("ajay is youngest:" +a);
            }
        }

    }
}
