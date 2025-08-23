package array;

import java.util.*;
// public class array2 {
//     public static void main(String[] args) {
//         int arr[]={1,2,4,6,8,10};
//         pairs(arr);

//     }
//     public static void pairs(int arr[]){
//         int tp=0;
//         for (int i = 0; i < arr.length; i++) {
//             //int curr=arr[i];
//             for (int j = i+1; j < arr.length; j++) {
//                 System.out.print("("+arr[i]+","+arr[j]+")");
//                 tp++;
//             }

//             System.out.println();
//         }
//         System.out.println(tp);
//     }

//}
// public class array2 {

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8};
//         subarrays(arr);
//     }
//     public static void subarrays(int arr[]){
//         int ts=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for(int k=i;k<=j;k++){
//                     System.out.print(arr[k]);
//                 }
//                 System.out.println();
//                 ts++;
//             }
//             System.out.println();
//         }
//         System.out.println(ts);
//     }
// }
public class array2 {

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        sumsub(arr);
    }

    public static void sumsub(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum=0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];

                }
          //      System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }

            }

        }
        System.out.println(max);

    }
}