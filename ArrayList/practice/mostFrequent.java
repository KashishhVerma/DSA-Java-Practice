package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import asscending.count;

public class mostFrequent {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,1,4,1,3,2,3));
        System.out.println(frequentNum(list, 1));

    }
    public static int frequentNum(ArrayList<Integer> list,int key){
        ArrayList<Integer> targets = new ArrayList<>();
        ArrayList<Integer> counts=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i)==key){
                int target=list.get(i+1);
                int index=targets.indexOf(target);
                if(index==-1){
                    targets.add(target);
                    counts.add(1);
                }
                else{
                    counts.set(index,counts.get(index)+1);
                }
            }
        }
        int maxCount=-1;
        int maxTarget=-1;
        for(int i=0;i<counts.size();i++){
            if(counts.get(i)>maxCount){
                maxCount=counts.get(i);
                maxTarget=targets.get(i);

            }
        }
        return maxTarget;
    }
}
