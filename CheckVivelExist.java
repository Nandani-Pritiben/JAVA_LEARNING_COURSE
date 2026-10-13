public class CheckVivelExist {
    
  public static boolean isVovel(String str){
    // return str.toLowerCase().matches(".*[aeiou].*");
    return str.toLowerCase().matches(".*[a-z].*");
  }

   public static void main(String[] args) {
       String str="Hello";
       System.out.println(isVovel(str));
   }

}
