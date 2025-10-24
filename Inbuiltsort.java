package _7_Sorting;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Inbuiltsort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        Arrays.sort(arr,0,5);
        // Arrays.sort(arr,Collections.reverseOrder());
            // Arrays.sort(arr,0,5,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
