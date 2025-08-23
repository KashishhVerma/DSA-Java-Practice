package array;
import java.util.*;
public class rainwater {
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println(rainWater(height));
    }
    public static int rainWater(int height[]){
        int h=height.length;
        //leftMax
        int leftMax[]=new int[h];
        leftMax[0]=height[0];
        for(int i=1;i<h;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);//leftmax he kyun liya
        }
        //rightMax
        int rightMax[]=new int[h];
        rightMax[h-1]=height[h-1];// -1 kyun liya
        for(int j=h-2;j>=0;j--){
            rightMax[j]=Math.max(height[j], rightMax[j+1]);//+1 kyun hua
        }
        //loop
        int tarppedWater=0;
        for(int i=0;i<h;i++){
           int waterLevel=Math.min(leftMax[i], rightMax[i]);//index kyun liya
           tarppedWater+=waterLevel-height[i];
        }
        return tarppedWater;
    }
}
