import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any integer :");

        int n = sc.nextInt();
        if(n<0){  //if n is less than zero
                 n = n * (-1); // (-4)*(-1) = 4 positive interger |-4| = 4 ,|3|= 3
        }
            System.out.println("the absolute value is: " +n);
        }


    }
