public class palindrome {
    public static boolean isPalindromes(String str){
        for(int i=0;i<str.length();i++){
            int n=str.length();
            if (str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        // System.out.println("palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "racaecar";
       // System.out.println(isPalindromes(str));
       if (isPalindromes(str)) {
         System.out.println("palindrome");
       }
       else{
        System.out.println("not");
       }
    }
}


//////////////my method//////////////////////////
// public static void main(String[] args) {
//     String str = "racecsar";
//     int n = str.length();
//     for (int i = 0; i <= n / 2; i++) {
//         if (str.charAt(i) != str.charAt(n - i - 1)) {
//             System.out.println("notn palindrome");
//             return;
//         }
//     }
//     System.out.println("palindrome");
// }