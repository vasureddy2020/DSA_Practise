package sortingalgos;

public class BubbleSort {
    static void bubbleSort(int arr[],int n){
       int i,j,temp;
       for(i=0;i<n-1;i++){
           for(j=0;j<n-1-i;j++){
               if(arr[j]>arr[j+1]){
                   temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
               }
           }
       }
    }
    static void printArray(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr={14,5,34,8,2,90,12};
        int len = arr.length;
        bubbleSort(arr,len);
        printArray(arr,len);

    }
}
