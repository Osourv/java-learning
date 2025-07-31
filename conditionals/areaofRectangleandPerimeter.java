import java.util.Scanner;
public class areaofRectangleandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the length: ");
        int l = sc.nextInt();

        System.out.print("enter the breath: ");
        int b = sc.nextInt();

        int area = l*b;
        int perimeter = 2*(l+b);

        if(area>perimeter){
            System.out.println("area of rectangle is greater than its perimeter: " + area);

        }
        else{
            System.out.println("area of rectangle is smaller than its perimeter: " + perimeter);
        }


    }
}
