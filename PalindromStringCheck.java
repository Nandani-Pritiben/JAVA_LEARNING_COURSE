public class PalindromStringCheck {
    public static boolean PalindromCheck(String in){
        if(in==null || in.isEmpty()==true){
            return false;
        }
        String text=in.toLowerCase();
        int left=0;
        int right=text.length()-1;
        while(left<right){
            if(text.charAt(left)!=text.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
      String in="radar";
      System.out.println(PalindromCheck(in));
      String str1="Radar";
      System.out.println(PalindromCheck(str1));
      String str2="Hello";
      System.out.println(PalindromCheck(str2));
    }
}
