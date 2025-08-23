package array;
import java.util.*;
public class stock1 {
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(stock(price));
    }
    public static int stock(int price[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buyPrice>price[i]){
                buyPrice=price[i];

            }else{              
                int profit=price[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
        }
        return maxProfit;
    }

}
