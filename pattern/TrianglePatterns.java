// //1. *
//      * *
//      * * *
//      * * * *
public class TrianglePatterns{
    public static void main(String[] args){
        // for(int i=0;i<=4;i++){
        //     for (int j = 0; j < i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    

/*
* * * * 
* * *
* *
*
*/
// for(int i=4;i>=1;i--){
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
/*
*
**
***
****
***
**
*

*/
// for(int i=0;i<=4;i++){
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


// for(int i=3;i>=1;i--){
//             for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
/*
   *
  **
 ***
****
*/
// for(int i=0;i<=4;i++){
//     for(int j=4-i;j>=1;j--){
//         System.out.print(" ");
//     }
//     for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
// }
/*
****
 ***
  **
   *
*/
// for(int i=0;i<=4;i++){
//     for (int j = 0; j < i; j++) {
//                 System.out.print(" ");
//             }
//       for(int j=4-i;j>=1;j--){
//         System.out.print("*");
//     }  
    
//             System.out.println();
// }
/*
   *
  **
 ***
****
 ***
  **
   *
*/
// for(int i=0;i<=4;i++){
//     for(int j=4-i;j>=1;j--){
//         System.out.print(" ");
//     }
//     for (int j = 0; j < i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
// }
// for(int i=0;i<=3;i++){
//     for (int j = 0; j <= i; j++) {
//                 System.out.print(" ");
//             }
//       for(int j=3-i;j>=1;j--){
//         System.out.print("*");
//     }  
    
//             System.out.println();
// }
/*
*      *
**    **
***  ***
********
***  ***
**    **
*      *

 */
int n=4;
// for (int i = 1; i <= n; i++) {
//             // Left Stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Middle Spaces: 2 * (n - i)
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Right Stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//           // ---- LOWER HALF ----
//         for (int i = n-1; i >= 1; i--) {
//             // Left Stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             // Middle Spaces: 2 * (n - i)
//             for (int j = 1; j <= 2 * (n - i); j++) {
//                 System.out.print(" ");
//             }
//             // Right Stars
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
/*
   *
  * *
 * * *
* * * *
*/
// for(int i=1;i<=n;i++){
//     for(int j=n-i;j>=1;j--){
//     System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//     System.out.print("*"+" ");
//     }
//     System.out.println();
// }
/*
* * * *
 * * *
  * *
   *
*/
// for(int i=1;i<=n;i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(" ");
//     }
//     for(int j=n;j>=i;j--){
//         System.out.print("*"+" ");
//     }
//     System.out.println();
// }
/*
   *
  * *
 * * *
* * * *
 * * *
  * *
   *
*/
//  for(int i=1;i<=n;i++){
//     for(int j=n-i;j>=1;j--){
//     System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//     System.out.print("*"+" ");
//     }
//     System.out.println();
// }
// for(int i=1;i<=n;i++){
//     for(int j=1; j<=i; j++){
//         System.out.print(" ");
//     }
//     for(int j=n-1;j>=i;j--){
//         System.out.print("*"+" ");
//     }
//     System.out.println();
// }
/*
  5
 33
222
*/
int[] a={5,3,2};
for (int i = 0; i <a.length; i++) {
    for(int j=a.length-i;j>=1;j--){
        System.out.print(" ");
    }
    for(int j=0; j<=i;j++){
        System.out.print(a[i]);
    }
    System.out.println();
}
}
}