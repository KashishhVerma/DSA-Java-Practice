
import java.util.*;


public class anagrams {
    public static void printAnagrams(String Str1, String Str2) {
        // lower case so not to worry about uppercase or lowercase
        Str1 = Str1.toLowerCase();
        Str2 = Str2.toLowerCase();
        // if length equals so theie is possibility of being eqauls
        if (Str1.length() == Str2.length()) {
            // making array
            char[] Str1Arr = Str1.toCharArray();
            char[] Str2Arr = Str2.toCharArray();
            // sorting array
            Arrays.sort(Str1Arr);
            Arrays.sort(Str2Arr);
            // to check both are equals
            boolean result = Arrays.equals(Str1Arr, Str2Arr);
            if (result) {
                System.out.println("anagrams");
                return;
            }
        }
        System.out.println("not anagrams");

    }

    public static void main(String[] args) {
        String str1 = "earthe";
        String str2 = "heart";
        printAnagrams(str1, str2);
    }
}
