
import java.math.BigInteger;

public class Factorial {

    public static BigInteger Factorial(int num) {
        if(num<=1){
            return BigInteger.ONE;
        }

        return BigInteger.valueOf(num).multiply(Factorial(num - 1) );
    }

    public static void main(String[] args){
        int num=10;
        System.out.print(Factorial(num));
    }
}
