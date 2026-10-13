import java.lang.StringBuilder;

public class removeWhiteSpaceInString {
    public static String RemoveWhiteSpace(String str) {
        StringBuilder sb=new StringBuilder();
        char[] charArray=str.toCharArray();
        for(char c: charArray) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str=" h ell o ";
        System.out.print(RemoveWhiteSpace(str));

    }
}
