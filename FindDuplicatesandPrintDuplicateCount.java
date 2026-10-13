import java.util.Map;
import java.util.HashMap;
public class FindDuplicatesandPrintDuplicateCount {
    public static void PrintDuplicates(int[] numbers){
        Map<Integer,Integer> counts=new HashMap<>();

       for(int num:numbers){
        counts.put(num,counts.getOrDefault(num,0)+1);
       }
       for(Map.Entry<Integer,Integer> entry:counts.entrySet()){
        if(entry.getValue()>1){
        System.out.println(entry.getKey() + " appears "+ entry.getValue());
        }
       }

    }
    public static void main(String[] args){
        int[] numbers={2,4,2,5,6,7,3,4,3};
        PrintDuplicates(numbers);
    }
}
