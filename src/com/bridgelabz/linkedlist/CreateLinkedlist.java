package com.bridgelabz.linkedlist;
import java.util.LinkedList;



class MyNode{
    int data;
     MyNode next;
    public  MyNode(int data)
    {
        this.data=data;
        this.next=null;

    }
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }



}

public class CreateLinkedlist {
     MyNode head;

    public static void main(String[] args) {

        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(70);

        //56-30->70
        myFirstNode.next = mySecondNode;
        mySecondNode.next = myThirdNode;
        insertNodeBetween(myFirstNode, mySecondNode, myThirdNode);

        LinkedList<MyNode> l1 = new LinkedList<>();
        l1.add(myFirstNode);
        l1.add(mySecondNode);
        l1.add(myThirdNode);
        pop(l1);
        System.out.println("LinkedList " + getNodeSequence(l1));
    }


    public void insert(int data) {
        MyNode newNode = new MyNode(data);
        if (head == null) {
            head = newNode;
        } else {
            MyNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public MyNode search(int key) {
        MyNode current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(MyNode preNode, int newData) {
        if (preNode == null) {
            System.out.println("Previous node not null");
            return;
        }
        MyNode newNode = new MyNode(newData);
        newNode.next = preNode.next;
        preNode.next = newNode;


    }

    public void delete(int key)
    {
        MyNode current = head;
        MyNode prev=null;

        if(current!=null && current.data ==key)
        {
            head=current.next;
            return;
        }
        while(current !=null && current.data !=key)
        {
            prev=current;
            current=current.next;
        }
        if(current==null)
        {
            return;
        }
        prev.next=current.next;
    }

    public int size()
    {
        int count=0;
        MyNode current = head;
        while(current!=null)
        {
            count++;
            current=current.next;
        }
        return count;
    }

    private static void insertNodeBetween(MyNode previousNode, MyNode newNode, MyNode nextNode) {
        previousNode.next = newNode;
        newNode.next = nextNode;

    }


//   // private static void pop(LinkedList<MyNode> linkedList)
//    {
//        linkedList.removeFirst();
//    }

    private static void pop(LinkedList<MyNode> LinkedList) {
        LinkedList.removeLast();
    }


    private static String getNodeSequence(LinkedList<MyNode> linkedList) {
        StringBuilder sequence = new StringBuilder();

        for (MyNode node : linkedList) {
            sequence.append(node.data).append("->");

        }

        sequence.delete(sequence.length() - 2, sequence.length());
        return sequence.toString();

    }
}
