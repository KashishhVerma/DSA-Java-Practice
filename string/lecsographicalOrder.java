public class lecsographicalOrder {
    
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana"};
        String largset=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largset.compareTo(fruits[i])<0){
                largset=fruits[i];
            }

        }
        System.out.println(largset);
    }
}
