import java.util.Scanner;
public class threepointsOnaLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //int x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;
        System.out.println("enter x1: ");
        int x1 = sc.nextInt();

        System.out.println("enter x2: ");
        int x2 = sc.nextInt();

        System.out.println("enter x3: ");
        int x3 = sc.nextInt();

        System.out.println("enter y1: ");
        int y1 = sc.nextInt();

        System.out.println("enter y2: ");
        int y2 = sc.nextInt();

        System.out.println("enter y3: ");
        int y3 = sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);
        int m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("all three points on a straight line");
        }
        else{
            System.out.println("they do not lie");
        }


    }
}
