package com.company;

public class DoublyLinkedList {
private Node head;
private Node tail;
private int length;
 DoublyLinkedList(int value){
    Node newNode = new Node(value);
    head=newNode;
    tail= newNode;
    length=1;
}
public void getHead(){
    System.out.println(head.value);
}
public void getTail(){
    System.out.println(tail.value);
}
public void getLength(){
    System.out.println(length);
}
public void printList(){
    Node temp = head;
    while(temp!=null){
        System.out.println("Dll Value is:"+temp.value);
        temp=temp.next;
    }

}
public void append(int value){
    Node newNode = new Node(value);
    if(length==0){
        head=newNode;
        tail=newNode;
    }
    else {
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    length++;
}
public Node removeLast(){
    if(length==0) return null;
    else if(head.next==null){
        head=null;
        tail=null;
        length--;
        return null;
    }
    else {
        Node temp = tail;  //1 2 3 4 5
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
}
public void prepend(int value){
    Node newNode = new Node(value);
    if(length==0) {
        head=newNode;
        tail=newNode;
    }
    else {
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    length++;
}
public Node removeFirst(){
    if(length==0) return null;
    Node temp=head;
     if (length==1) {
        head=null;
        tail=null;
    }
    else{
       head=head.next;
       head.prev=null;
       temp.next=null;

    }
    length--;
    return temp;
}
public Node get(int index){
    if(index<0||index>=length) return null;
    Node temp = head;
    if(index<length/2){
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
    }
    else {
        temp=tail;
        for(int i=length-1;i>index;i--){
            temp=temp.prev;
        }
    }
    return temp;
}
public boolean set(int index, int value){
    Node temp = get(index);
    if(temp!=null){
        temp.value=value;
        return true;
    }
    return false;
}
public boolean insert(int index,int value){
    Node newNode = new Node(value);
    if(index<0 ||  index>length) return false;
    if(index ==0){
        prepend(value);
        return true;
    }
    if(index==length){
        append(value);
        return true;
    }
    Node temp = get(index);
    Node temp2 = get(index-1);
    temp2.next=newNode;
    newNode.next=temp;
    temp.prev=newNode;
    newNode.prev=temp2;
    length++;
    return true;
}
public Node remove(int index){
    if(index<0||index>= length) return null;
    if(index==0){
       return removeFirst();
    }
    if(index==length-1){
      return  removeLast();
    }
    Node temp = get(index);
    Node bef = temp.prev;
    Node aft = temp.next;
    bef.next=aft;
    aft.prev=bef;
    temp.next=null;
    temp.prev=null;
    length--;
    return temp;

}

}
