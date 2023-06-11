package com.company;

public class array {
    public static void main(String[] args) {
//        System.out.println("vas");
//        Node test = new Node(1);
//        System.out.println(test.value);
//        Node test2 = new Node(2);
//        Node test3 = new Node(3);
//        Node test4 = new Node(4);
//        test.next=test2;
//        System.out.println(test.next.value);
//        System.out.println(test.next);
//        test2.next=test3;
//        test3.next=test4;
//        System.out.println(test.next.next.value);
//        System.out.println(test3.next.value);

        int arr[]={1,2,3,4,5};
        for(int i=1;i<arr.length;i++) {
            arr[i]=arr[i-1]+arr[i];

        }
        for(int i:arr){
            System.out.println(i);
        }

    }
}
