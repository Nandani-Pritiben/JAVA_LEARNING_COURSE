public class PalindromNumber {

    public static boolean isPalindrom(int num) {
        String str=Integer.toString(num);
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int num=123;
        System.out.println(isPalindrom(num));
    }
}
