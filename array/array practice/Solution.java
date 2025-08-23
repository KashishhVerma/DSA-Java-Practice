// public class maxSum {

//     public static void main(String[] args) {
//         int arr[]={12,-1,3,4,-5,8};
//         maxSumSubArray(arr);
//     }
//     public static void maxSumSubArray(int arr[]){
//         int maxSum=Integer.MIN_VALUE;
//         int currSum=0;

//         for (int i = 0; i < arr.length; i++) {
//             if(maxSum<currSum){
//                 maxSum=currSum;

//             }
//         }
//         System.out.println(maxSum);
//     }
// }
//import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//       int arr[]={1,2,3,1};
//       dup(arr);
//   }
//   public static boolean dup(int arr[]){
//     for (int i=0;i<arr.length ;i++ ) {
//        for (int j=1;j<=i ;j++ ){
//          if(arr[i]=arr[j]){
//            return true;
//          }
//         }
//     }
//     return false;
//   }
// }
// public class sum{
//     public static void main(String args[]){
//         int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//         maxSum(arr);

//     }
//     public static void maxSum(int arr[]){
//         int max=Integer.MIN_VALUE;
//         int curr=0;
//         for(int i=0;i<arr.length;i++){
//            curr=curr+arr[i];
//            if(curr<0){
//             curr=0;
//            }
//            max=Math.max(max, curr);
          
//     }
//     System.out.println(max);
// }
// }
class Solution {
    public static int maxSubArray(int[] arr) {
         int max=arr[0];
        int curr=arr[0];
        for(int i=1;i<arr.length;i++){

           curr=Math.max(arr[i],curr+arr[i]);
           
           max=Math.max(max, curr);
          
    }
    return max;
    }
     public static void main(String args[]){
        int arr[]={100,-2,-3};
        System.out.println(maxSubArray(arr));

    }
}