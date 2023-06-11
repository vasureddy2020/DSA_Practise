package com.company;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

 LinkedList(int value){
    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;    // here with this constructor we r creating a new linked list
    length = 1;        // with a single newNode as head and tail and setting length as 1
}                      // we can still achieve this linked list without this constructor also

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println("Value is :" + temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getLength() {
        System.out.println("Length :" + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next=head;
            head= newNode;
        }
        length++;
    }
    public Node removeFirst(){
        if (length == 0) return null;
        Node temp=head;
        head= head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
      return temp;
    }
    public Node get(int index){
    if(index<0||index>=length) return null;
    Node temp=head;
    for(int i=0;i<index;i++){
        temp=temp.next;
    }
        return temp;
    }
    public boolean set(int index,int value){
    Node temp = get(index);
    if(temp!=null){
        temp.value=value;
        return true;
    }
    return false;
    }
    public boolean insert(int index,int value){
    Node newNode = new Node(value);
        if(index<0||index>=length) return false;
    if(index==0){
        prepend(value);
        return true;
    }
    if(index==length){
        append(value);
        return true;
    }
    Node temp= get(index-1);
    newNode.next=temp.next;
    temp.next=newNode;
    length++;
    return true;
    }
    public void reverse(){
        Node temp = head;              // values are not changing only nodes are changing
        head= tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for(int i=0;i<length;i++){
            after= temp.next;
            temp.next=before;
            before = temp;
            temp= after;
        }
    }
    public Node remove(int index) {
        if(index<0||index>length) return null;
        if(index==0){
          return removeFirst();
        }
        if(index==length-1){
           return removeLast();
        }
       Node prev = get(index-1);
        Node temp = prev.next;
        prev.next=temp.next;
        temp.next=null;
        length--;
        return temp;

    }
public void reverse1() {
    Node temp=head;
    Node before = null;
    head = tail;
    tail=temp;
    Node after = null;
    for(int i=0;i<length;i++){
        after=temp.next;
        temp.next=before;
        before = temp;
        temp=after;
    }
}
}
