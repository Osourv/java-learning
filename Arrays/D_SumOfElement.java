package Arrays;

public class D_SumOfElement {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,6,7};
        int sum = 0;
        for(int i=1; i<arr.length; i++){
            sum +=arr[i];
        }
        System.out.print("Sum of elements:");
        System.out.println(sum);
    }
}
