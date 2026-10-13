public class SwappedVariables {

   public static void swappedVariableWithoutUsingThidOne(String[] args) {
       
   }

    public static void main(String[] args) {
        int a=10;
        int b=1;
        System.out.println("Before Swapped a= "+a);
        System.out.println("Before Swapped b= "+b);

        // b=b+a;
        // a=b-a;//(b+a)-a
        // b=b-a;//(b+a)-b

        int temp=a;
        a=b;
        b=temp;

        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
