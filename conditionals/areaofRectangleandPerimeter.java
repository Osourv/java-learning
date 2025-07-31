import java.util.Scanner;
public class areaofRectangleandPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the length: ");
        int l = sc.nextInt();

        System.out.print("enter the breath: ");
        int b = sc.nextInt();

        int area = l*b; //area=16
        int perimeter = 2*(l+b); //perimeter=16

        if(area>perimeter){  // this condition not fullfil that's why else run either > or =
            System.out.println("area of rectangle is greater than its perimeter: " + area);

        }
        else{    // -> if(perimeter >= area)
            System.out.println("area of rectangle is smaller than its perimeter: " + perimeter);
        }


    }
}
