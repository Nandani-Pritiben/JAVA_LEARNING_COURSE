public class java_stringBuilder{
    public static void main(String[] args){
        String Original="Hello World";
        String reversed=new StringBuilder(Original).reverse().toString();
        System.out.println(reversed);
    }
}