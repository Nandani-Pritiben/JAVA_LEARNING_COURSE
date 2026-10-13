import java.util.Map;
import java.util.HashMap;


public class CharacterCount {

    public static void CharacterCountInText(String in){
      if(in.length()==0){
        System.out.println(in);
      }
      Map<Character,Integer> counts= new HashMap<>();
      for(char ch:in.toCharArray()){
        counts.put(ch,counts.getOrDefault(ch,0)+1);
      }

      for(Map.Entry<Character,Integer> c: counts.entrySet()){
        if(c.getValue()>1){
         System.out.println(c.getKey() + " appears" + c.getValue());
      }
      }
    }
    public static void main(String[] args){
        String text="Hello";
        CharacterCountInText(text);

    }
}
