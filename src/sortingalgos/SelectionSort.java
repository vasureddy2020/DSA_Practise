package sortingalgos;

public class SelectionSort {
    public static void selectionSort(int[] arr,int n){
        int j,i,temp;
        for(i=0;i<n-1;i++){
            for(j=i+1;j<n-1;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
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
        selectionSort(arr,len);
        printArray(arr,len);

    }
}
