import java.util.Scanner;
public class percentageElseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the percentage: ");

        double n = sc.nextDouble ();

        if(n>=90){
            System.out.println("excellent");
        }
        else if(n>=80){
            System.out.println("very good");
        }
        else if(n>=70){
        System.out.println("good");
        }
        else if(n>=60){
            System.out.println("can do better");
        }
        else if(n>=50){
            System.out.println("average");
        }
        else if(n<=50){
            System.out.println("below average");
        }
        else{
            System.out.println("fail");
        }
    }
}
