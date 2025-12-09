package Arrays;

import java.util.Scanner;

public class B_OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,3,4,5,5}; 
    int n = arr.length; // index 0 to n-1
        for(int i =0 ;i<n; i++){
        System.out.print(arr[i] + " ");
    }

    int [] sourav = new int[7];
    //default values -> all array element is 0 
    for(int i = 0; i<7 ; i++){
        System.out.print(sourav[i]+ " ");
    }

    //input
    for(int i=0; i<7; i++){
        sourav[i] = sc.nextInt();
    }

    //print
    for(int i=0; i<7; i++){
        System.out.print(2*sourav[i]+ " "); 
    }

}
}


