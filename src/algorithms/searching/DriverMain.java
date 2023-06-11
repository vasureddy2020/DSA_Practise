package algorithms.searching;

import java.time.LocalTime;

public class DriverMain {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6};
       // System.out.println(LinearSearch.search(4,arr));
        System.out.println(BinarySearch.binarySearch(arr,1));
//        LocalTime myObj = LocalTime.now();
//        System.out.println(myObj);
    }
}

