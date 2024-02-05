package com.bridgelabz.linkedlist;

public class MyNode<k>{


    public   k key;
    private MyNode next;
    public  MyNode(k key)
    {
        this.key=key;
        this.next=null;

    }
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }



}
