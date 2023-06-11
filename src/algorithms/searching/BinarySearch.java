package algorithms.searching;

public class BinarySearch {
    public static int binarySearch(int[] arr,int val){
        int l=0,r=arr.length-1;
       while(l<=r){
         int m=(l+r)/2;
           if(arr[m]==val){
               return m;
           }
           if(arr[m]<val){
               l=m+1;
           }
           if(arr[m]>val){
               r=m-1;
           }
       }
       return -1;
    }
}
