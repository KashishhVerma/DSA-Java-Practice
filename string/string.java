import java.util.*;
public class string{
    public static void prints(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" -");
        }
    }
    public static void main(String[] args) {
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String name=new String("xyz");


        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);


        // String name="kashish verma";
        // int h=name.length();
        // System.out.println(h);
        // System.out.println(name.length());


        String f="kashish";
        String l="verma";
        String fl=f+l;
        // System.out.println(fl);


        prints(fl);
    }
}