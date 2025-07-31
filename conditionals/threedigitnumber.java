import java.util.Scanner;
public class threedigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n = sc.nextInt();
             
        if(n>99 && n<1000){  // use multiple conditions like && , ||
            System.out.println("this is a 3 digit number: ");
        }
        else{
            System.out.println("this is not a 3 digit number");
        }
    }
}
