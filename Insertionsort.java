package _7_Sorting;
public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={10,20,5,16,5,1};
       for(int i=1;i<arr.length;i++){
        int prev=i-1;
        int curr=arr[i];
        while(prev>=0 && curr<arr[prev]){
            arr[prev+1]=curr;
            prev--;
        }
        arr[prev+1]=curr;
       }
        
    }
}
