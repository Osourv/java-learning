package javainput;

import java.util.Scanner; // import package

public class areaCirclewithInput {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 

    System.out.print("enter the radius :");
     
    int radius= sc.nextInt(); // taking input from user
    double pi = 3.14;         // pi value in double 

    double area = pi * radius * radius;

    System.out.println("area of circle :" + area);

    
 }   
}
