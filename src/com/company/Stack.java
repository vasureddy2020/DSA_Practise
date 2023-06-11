package com.company;

public class Stack {
private Node top;
private int height;
    public class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public Stack(int value){
        Node newNode = new Node(value);
        top = newNode;
        height=1;
    }
    public void printStack(){
        Node temp = top;
        while(temp!=null){
            System.out.println("Value is :"+temp.value);
            temp=temp.next;
        }
    }
    public void getTop(){
        System.out.println("Top :"+top.value);
    }
    public void getHeight(){
        System.out.println("Height :"+height);
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(top==null){
            top=newNode;
        }
        else{
            newNode.next=top;
            top = newNode;
        }
        height++;
    }
    public Node pop() {
        if(height==0) return null;
        else {
            Node temp=top;
            top=top.next;
            temp.next=null;
            height--;
            return temp;
        }
    }
}
