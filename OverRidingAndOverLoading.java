

public class OverRidingAndOverLoading {
//     static class OverLoading{
//       void print(String str){
//       System.out.println(str);
//     }
//       void print(String str,int count){
//         while(count>0){
//           System.out.println(str);
//           count--;
//         }
//     }
// }
//     public static void main(String[] args) {
//         OverLoading f=new OverLoading();
//         f.print("neha");
//         f.print("neha",3);
//     }

//Overriding
static class Base {
 void printName() {
  System.out.println("Base Class");
 }
}

static class Child extends Base {
 @Override
 void printName() {
  System.out.println("Child Class");
 }
}

 public static void main(String[] args){
    Base obj1=new Base();
    Child obj2=new Child();
    obj1.printName();
    obj2.printName();
    String s1="java";
    String s2="java";
    System.out.println(s1==s2);
 }

}

