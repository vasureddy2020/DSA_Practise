package arraysds;
import java.util.*;

public class DriverClass {
    public static void main(String[] args) {
        //int arr[]={0,1,2,0,1,2,0,0,2,0,1,0,2,2,1,0,0,1,2,1,2,1};
        //int arr[] = {2,5,45,23,89,33,22,7,55,44,6,5};
        int[] arr={2,3,5,7,7,8,8,8,9,9,9,9};
        int n=arr.length;
        ArrayOperations rev = new ArrayOperations(){
            @Override
            public void printVasu() {
                //super.printVasu();
                System.out.println("vasu main method");
            }

            public void printveeri() {
                //super.printVasu();
                System.out.println("veeri main method");
            }

        };
        // rev.reverseArray(arr,0,6);
        //rev.rotateArrayAnticlock(arr);
        //rev.rotateArrayAnticlock(arr);
        //rev.rotateArrayAnticlock(arr);
        //rev.rotateArrayclock(arr);
        //rev.dutchNationalFlagAlgo(arr,n);
        //ArrayOperations.dutchAnotherMethod(arr,n);
        //ArrayOperations.getLargestThreeElements(arr,n);
        //ArrayOperations.duplicateFinder(arr,n);
        //ArrayOperations.secondLargest(arr,n);
rev.printVasu();
rev.printveeri();



//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]);
//        }
    }
}
