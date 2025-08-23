package array;

import java.util.*;
// public class again {
//     public static void main(String[] args) {
//         int arr[]=new int[3];
//         arr[0]=0;
//         arr[1]=1;
//         // arr[2]=0;
//         // System.out.println(arr[i]);
// //         arr={1,2,3};
// for (int i = 0; i < arr.length; i++) {

//     System.out.println(arr[i]);
// }
//     }

// }
// public class again {

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter the target");
//         int key=sc.nextInt();
//         int arr[]={1,2,3,4,8,9,10};
//        // System.out.println(LS(arr));
//        int index=LS(arr,key);
//        System.out.println("found at "+index);
//     //    if(index==-1){
//     //     System.out.println("not found");
//     //    }else{
//     //     System.out.println("found at "+index);
//     //    }
//     }
//     public static int LS(int arr[],int key){
//        // int key;
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==key){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,15,6,7};
//         System.out.println(largestf(arr));
//         // System.out.println("smallest value is "+largestf(arr));
//     }
//     public static int largestf(int arr[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if(largest<arr[i]){
//                 largest=arr[i];
//             }
//             if(smallest>arr[i]){
//                 smallest=arr[i];
//             }
//         }
//         System.out.println("smallest value is "+smallest);
//         System.out.println("l value is "+largest);
//         return largest;

//     }
// }
// public class again {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 7, 9, 56, 89 };
//         int target = 90;
//         int result=BS(arr, target);
//         if(result==-1){
//             System.out.println("not found");
//         }else{
//             System.out.println("elemnt on index :"+result);
//         }

//         // System.out.println("index: " + BS(arr, target));
//     }

//     public static int BS(int arr[], int target) {

//         int start = 0;
//         int end = arr.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (target == arr[mid]) {
//                 return mid;
//             }
//             else if (target > arr[mid]) {
//                 start = mid + 1;

//             } else {
//                 end = mid - 1;
//             }

//         }
//         return -1;
//     }
// }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={2,3,4,5,6,7,8};
//         System.out.println(revesre(arr));
//     }
//     public static void revesre(int arr[]){
//         int first=0;
//         int last=arr.length-1;
//        while (first<last) {
//         for (int i = 0; i < arr.length; i++) {
            
        
//         int temp=arr[last];
//         arr[last]=arr[first];
//         arr[first]=temp;
//         first++;
//         last--;
//         System.out.println(arr[i]);
//         }
//        }
//     }
// }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         subarray(arr);
//     }
//     public static void subarray(int arr[]){
//       int  tp=0;
//         for (int i = 0; i < arr.length; i++) {
//             int curr=arr[i];
//             System.out.println(curr);
//             for (int j = i+1; j < arr.length; j++) {
//                System.out.print("("+ curr+","+arr[j]+")");
//                tp++;
//             }
//             System.out.println();
//         }
//         System.out.println(tp);
//     }

// }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         sub(arr);

//     }
//     public static void sub(int arr[]){
//        int tp=0;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 for (int j2 = i; j2 <= j; j2++) {
//                     System.out.print(arr[j2]);
//                     tp++;
//                 }
//                 System.out.println();
//             }
//             System.out.println();
//         }
//         System.out.println(tp);

//     }
// }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         MaxSub(arr);
//     }
//     public static void MaxSub(int arr[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = i; j < arr.length; j++) {
//                 currSum=0;
//                 for (int j2 = i; j2 <= j; j2++) {
//                     currSum+=arr[j2];
//                 }
//                 if ((maxSum<currSum)) {
//                     maxSum=currSum;
//                 }
//             }
//         }
//         System.out.println(maxSum);
// //     }
// // }
// public class again {

//     public static void main(String[] args) {
//         int arr[]={2,4,6,8,10};
//         subarray(arr);
//     }
//     public static void subarray(int arr[]){
//         int max=Integer.MIN_VALUE;
//         int currSum=0;
//         int prefix[]=new int[arr.length];
//         prefix[0]=arr[0];
//         for(int i=1;i<arr.length;i++){
//             prefix[i]=prefix[i-1]+arr[i];
//         }
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
//                 if (max<currSum) {
//                     max=currSum;
//                 }
//             }
//         }
//         System.out.println(max);
//     }
// }
public class again {

    public static void main(String[] args) {
        int arr[]={1,2,3,9,5,-4,8};
        maxSum(arr);
    }
    public static void maxSum(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for (int i = 0; i < arr.length; i++) {
            curr=+arr[i];
            if(curr<0){
                curr=0;
            }
            max=Math.max(max, curr);
        }
        System.out.println(max);
    }
}