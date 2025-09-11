public class substring {
    public static String printSubstring(String str,int S,int E){
        String subStr="";
        for(int i=S;i<E;i++){
            subStr+=str.charAt(i);
        }
        return subStr;


    }
   public static void main(String[] args) {
    String str="HelloWorld";
    System.out.println(printSubstring(str, 1, 6));
   }

}
