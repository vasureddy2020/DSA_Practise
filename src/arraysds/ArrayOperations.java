package arraysds;

import java.util.Arrays;
import java.util.List;

public class ArrayOperations {
public void reverseArray(int[] arr,int start,int end){

    int temp;
    if(start>=end)
        return;
        temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverseArray(arr,start+1,end-1);

}

public static void rotateArrayAnticlock(int[] arr){
    int n= arr.length;
    int temp;
    temp=arr[0];
    for(int i=1;i<=n-1;i++){
        arr[i-1]=arr[i];

    }
    arr[n-1]=temp;
}
    public static void rotateArrayclock(int[] arr){
        int n= arr.length;
        int temp;
        temp=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }

    public static void swap(int a,int b){
    int temp=0;
    temp=a;
    a=b;
    b=temp;
    }

    public static void dutchNationalFlagAlgo(int[] arr,int n) {
        int low = 0, mid = 0;
        int hi = n - 1;
        int temp = 0;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low = low + 1;
                mid = mid + 1;
            } else if (arr[mid] == 1) {
                mid = mid + 1;
            } else if (arr[mid] == 2) {
                temp = arr[hi];
                arr[hi] = arr[mid];
                arr[mid] = temp;
                hi = hi - 1;
            }
        }
    }
    public static void dutchAnotherMethod(int[] arr,int n){
    int i,cnt0=0,cnt1=0,cnt2=0;
    for(i=0;i<n;i++){
        switch (arr[i]){
            case 0:
                cnt0++;
                break;
            case 1:
                cnt1++;
                break;
            case 2:
                cnt2++;
                break;
        }
    }
        i=0;
        while (cnt0>0){
            arr[i++]=0;
            cnt0--;
        }
        while (cnt1>0){
            arr[i++]=1;
            cnt1--;
        }
        while (cnt2>0){
            arr[i++]=2;
            cnt2--;
        }
}
public static void getLargestThreeElements(int[] arr,int n){
    int first,sec,third;
    first=sec=third=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>first){
            third=sec;
            sec=first;
            first=arr[i];
        } else if (arr[i]>sec) {
            third=sec;
            sec=arr[i];
        } else if (arr[i]>third) {
            third=arr[i];
        }
    }
    System.out.println(first+"--"+sec+"--"+third);
}
public static void duplicateFinder(int[] arr,int n){
    int check=0;
    int count=1;
    for(int i=1;i<n;i++){
        if(count<4) {
            if (check != arr[n - i]) {
                System.out.println(arr[n - i]);
                check = arr[n - i];
                count++;
            }
        }
    }
}

public static void secondLargest(int arr[],int n){
    Arrays.sort(arr);
    for(int i=n-2;i>=0;i--){
        if(arr[i]!=arr[n-1]) {
            System.out.println(arr[i]);
            return;
        }
    }
}


    public void printVasu() {
        System.out.println("hi ra class method");
    }
    public void printveeri(){
        System.out.println("hi veeri class");
    }
}


