public class PrimeChacker {
    public static boolean isPrimeCheck(int number){
      if(number<=1 || number%2==0) return false;
      
      for(int i=3;i<=Math.sqrt(number);i+=2){
       if(number%i==0){
        return false;
       }
      }
      return true;
    }
    public static void main(String[] args){
        int num=7;
        System.out.println("This number is prime: "+ isPrimeCheck(num));
    }
}
