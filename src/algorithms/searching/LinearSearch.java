package algorithms.searching;

public class LinearSearch {
    public static int search(int value,int arr[]){
        int length = arr.length;
        for(int i=0;i<length;i++){
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }

}
