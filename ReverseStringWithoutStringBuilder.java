public class ReverseStringWithoutStringBuilder {
    public static String reverse(String in){


       if(in.length() == 0 ){
        return  in;
       }



        char[] Characters=in.toCharArray();

        int left=0;
        int right = Characters.length-1;
        while(left<right){
        char temp = Characters[left];
        Characters[left]=Characters[right];
        Characters[right]=temp;

        left++;
        right--;
        }
        return new String(Characters);
    }

    public static void main(String[] args){
        String original = "DigiWagon";
        System.out.println("Reversed: " + reverse(original));
    }
}
