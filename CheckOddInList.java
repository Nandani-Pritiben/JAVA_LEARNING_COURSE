import java.util.Arrays;
import java.util.List;

public class CheckOddInList {

   public static boolean isOdd(List<Integer> numList) {
       for(int i:numList){
        if(i%2==0){
            return false;
        }
        
       }
      return true; 
   }

    public static void main(String[] args) {
        List<Integer> l1=Arrays.asList(1,3,5,7,8);
        System.err.println(isOdd(l1));
    }
}
