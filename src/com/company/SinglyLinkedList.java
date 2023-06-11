package com.company;

public class SinglyLinkedList {
    public class Node1{
        int data;
        Node1 next;
        Node1(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node1 head;
    public Node1 tail;
    public void addtolist(int val){
        Node1 newNode = new Node1(val);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
//    public void display(){
//        System.out.println(head.data);
//        System.out.println(head.next.data);
//    }
    public static void main(String[] args){
        SinglyLinkedList lla=new SinglyLinkedList();
        lla.addtolist(7);
        lla.addtolist(8);
       // lla.display();
        System.out.println(lla.head.data);
    }
}
