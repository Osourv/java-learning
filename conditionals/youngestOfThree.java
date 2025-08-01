import java.util.Scanner;
public class youngestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of ram: ");
        int ram = sc.nextInt();

        System.out.println("enter age of shyam: ");
        int shyam = sc.nextInt();

        System.out.println("enter the age of ajay: ");
        int ajay = sc.nextInt();

        if(ram<shyam && ram<ajay){
            System.out.println("ram is youngest of the them all: " + ram);
        }
        else if(shyam<ram && shyam<ajay){
            System.out.println("shyam is youngest of the them all: " + shyam);
        }
        else if(ajay<ram && ajay<shyam){
            System.out.println("ajay is youngest of the them all: " + ajay);
        }
        else{
            System.out.println("all are equal");
        }

    }
}
