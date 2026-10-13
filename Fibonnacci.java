
import java.math.BigInteger;

public class Fibonnacci {

    // public static BigInteger Fibonacci(int num) {
    //     if(num<=0){
    //         return BigInteger.ZERO;
    //     }
    //     if(num==1){
    //         return BigInteger.ONE;
    //     }
    //     return Fibonacci(num-1).add(Fibonacci(num - 2));
    // }

    //Print all numbers

    public static BigInteger Fibonacci(int num){
        BigInteger first=BigInteger.ZERO;
        BigInteger second=BigInteger.ONE;
        for (int i = 1;i<=num; i++) {
            System.out.println(first);
            BigInteger next=first.add(second);
            first=second;
            second=next;
            }
        return first;
    }


    public static void main(String[] args) {
        int num=30;
        System.out.println(Fibonacci(num));
    }
}
