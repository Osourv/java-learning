//q-1) wap to determine whether the sellar has made profit or loss. also determine how much profit he made or loss. 
import java.util.Scanner;
public class CostPriceSellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cost price : ");
        int cp = sc.nextInt();
        System.out.print("selling price :");
        int sp = sc.nextInt();
        
    
        if(sp>cp){
            int profit = sp-cp;
            
            System.out.println("profit on this item : " + profit);
        }
        else{
            
            int loss = cp-sp;
            System.out.println("loss in this item : " + loss);
        }
    }

	

}
