
public class ReverseNumber {
    public static void main(String[] args) {
        int num=123;
        String numString=Integer.toString(num);

        String str=new StringBuilder(numString).reverse().toString();
        System.out.println(str);

    }
}
