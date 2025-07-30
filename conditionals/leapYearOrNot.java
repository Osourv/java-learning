import java.util.Scanner;
public class leapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a year :");

        int year = sc.nextInt();

        if(year%4==0){
            System.out.println("your entered year is leap year: " + year);
            
            System.out.println("welcome");
        }
        else{
            System.out.println("your entered year is not a leap year: " + year);

            System.out.println("sorry");
        }

    }
}
