// // import java.util.*;
// // public class max_min {
// //     public static void maxMin(int arr[]){
// //         int max=Integer.MIN_VALUE;
// //       int min=Integer.MAX_VALUE;
// //         for (int i = 0; i < arr.length; i++) {
// //             if(max<arr[i]){
// //                 max=arr[i];
// //             }
// //             if(min>arr[i]){
// //                 min=arr[i];
// //             }
// //         }
// //         System.out.println(min);
// //         System.out.println(max);
// //     }
// //     public static void main(String[] args) {
// //         int arr[]={1,2,43,5};
// //         maxMin(arr);
// //     }

// // }
// import java.util.*;

// class max_min {
//     public static Pair<Long,Long>getMinMax(int arr[]) {
//         long max = Long.MIN_VALUE;
//         long min = Long.MAX_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             if (max < arr[i]) {
//                 max = arr[i];
//             }
//             if (min > arr[i]) {
//                 min = arr[i];
//             }
//         }
//         // System.out.println(min);
//         // System.out.println(max);
//         return new Pair<>((long) min, (long) max);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 43, 5 };
//         Pair<Long, Long> result = getMinMax(arr);

//         System.out.print(result.getKey() + " ");
//         System.out.println(result.getValue());
       
       
//     }
// }
import java.util.*;

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class Solution {
    public static Pair<Long, Long> getMinMax(int arr[]) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return new Pair<>((long) min, (long) max);
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 56, 1000, 167};
        Pair<Long, Long> result = getMinMax(arr);

        System.out.print(result.getKey() + " "); // Print minimum
        System.out.println(result.getValue());    // Print maximum
    }
}