package array;
import java.util.*;
// public class array1 {

//     public static void main(String[] args) {
//         // int marks[]=new int[3];
//         // marks={1,2,4};
//         int marks[]={1,2,3};
//         // System.out.println(update(marks));
//         update(marks);
//         // for (int i = 0; i < marks.length; i++){
//         //     System.out.println(marks[i]);
//         // }
//       //  System.out.println();

//     }
//     public static void update(int marks[]){
//         for (int i = 0; i < marks.length; i++) {
//             marks[i]+=1;
//            System.out.println(marks[i]);

//         }
//     }
// }
// public class array1 {

//     public static void main(String[] args) {
//         int num[]={2,4,6,7,10,9,1};
//         int key=10;
//         // int index=ls(num, key);
//         System.out.println(ls(num, key));
//         // if(index==-1){
//         //     System.out.println("num not found");
//         // }else{
//         //     System.out.println("number at "+index);
//         // }
//     }
//     public static int ls(int num[],int key){
//         for (int i = 0; i < num.length; i++) {
//             if(num[i]==key){
//                 return i;
//             }
// //         }
// //         return -1;

// //     }
// // }
// public class array1 {

//     public static void main(String[] args) {
//         int arr[]={1,2,36,45,9,3,89};
//         System.out.println(glargest(arr));
//     }
//     public static int glargest(int arr[]){
//         int nlargset=Integer.MIN_VALUE;
//         int nsmallest=Integer.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if(nlargset<arr[i]){
//                 nlargset=arr[i];
//             }if (nsmallest>arr[i]) {
//                 nsmallest=arr[i];

//             }
//         }
//         System.out.println(nsmallest);
//         return nlargset;
//     }
// }
// public class array1 {

//     public static void main(String[] args) {
//         int num[]={1,2,3,46,76,4};
//         int key=46;
//         System.out.println(binSearch(num, key));
//     }
//     public static int binSearch(int num[],int key){
//         int start=0;
//         int end=num.length-1;
//         while (start<=end) {
//             int mid=(start+end)/2;
//             if(num[mid]==key){
//                 return mid;
//             }if(num[mid]<key){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
            
//         }
//         return -1;
//     }
// }
public class array1 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reversearr(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static int reversearr(int arr[]){
        int f=0;
        int l=arr.length-1;
        while (f<l) {
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            f++;
            l--;
        }
        return -1;
    }
}