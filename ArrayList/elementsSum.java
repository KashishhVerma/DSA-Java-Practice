import java.util.ArrayList;
public class elementsSum{
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // System.out.println(list);
        // int elemnt=list.get(1);
        // System.out.println(elemnt);
        // list.remove(1);
        // System.out.println(list);
        // list.set(2, 10);
        // System.out.println(list);
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));
        // // System.out.println(list.add(1));
        // list.add(1,13);
        // System.out.println(list);
        // System.out.println(list.size());
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}