import java.util.Set;
import java.util.HashSet;

public class FindDuplicates {
    public static Set Duplicates(int[] numbers){

        Set<Integer> seen=new HashSet<>();
        Set<Integer> duplicates=new HashSet<>();
        for(int num:numbers){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        return duplicates;
    }
    public static void main(String[] args){
      int[] arr={2,3,5,2,5,6,7,8};
      System.out.println(Duplicates(arr));
    }
}
