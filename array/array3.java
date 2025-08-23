package array;
import java.util.*;
// public class array3 {
//     public static void main(String[] args) {
//         int arr[]={-1,-2,-3};
//         maxsum(arr);
//     }
//     public static void maxsum(int arr[]) {
//         int ms=Integer.MIN_VALUE;
//         int cs=0;
//         for (int i = 0; i < arr.length; i++) {
//             cs+=arr[i];
//             if(arr[i]<0){
//                 ms=0;
//             }
//             if(cs<0){
//                 cs=0;
//             }
//             ms=Math.max(ms, cs);
//         }
//         System.out.println(ms);

        
//     }
//     public static void sums(int arr[]){
//         int currsum=0;
//         int maxsum=Integer.MIN_VALUE;
        
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 currsum=0;
//                 for(int k=i;k<=j;k++){
//                     currsum+=arr[k];
//                 }
//                 System.out.println(currsum);
//                 if (maxsum<currsum) {
//                     maxsum=currsum;
//                 }
                
//             }
            
//         }
//         System.out.println(maxsum);
//     }
// }
