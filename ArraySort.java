import java.util.Arrays;
public class ArraySort {
    // public static void main(String[] args){
    // int[] array={1,2,3,-1,0};
    // Arrays.sort(array);
    // System.out.println(Arrays.toString(array));
    // }
//}
    public static void main(String[] args){
        int[] arrays={1,2,3,-1,0};
        for(int j=0;j<arrays.length-1;j++){
        for(int i=0;i<arrays.length-1-j;i++){
            if(arrays[i]>arrays[i+1]){
             int temp=arrays[i];
             arrays[i]=arrays[i+1];
             arrays[i+1]=temp;
            }
        }
        }
        System.out.println(Arrays.toString(arrays));
    }
        
    }

