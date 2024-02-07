package com.bridgelabz.linkedlist;
import java.util.LinkedList;

class MyNode<T>{
    T data;
     MyNode<T> next;
    public  MyNode(T data)
    {
        this.data=data;
        this.next=null;

    }
    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }
}


public class CreateLinkedlist {
    MyNode<Integer> head;
    public static void main(String[] args) {

        CreateLinkedlist linkedList = new CreateLinkedlist();

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        //56-30->70
        myFirstNode.next = mySecondNode;
        mySecondNode.next = myThirdNode;
        insertNodeBetween(myFirstNode, new MyNode<>(40), myThirdNode);

        LinkedList<MyNode<Integer>> l1 = new LinkedList<>();
        pop(l1);
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
    public MyNode<Integer> search(int key) {
        MyNode<Integer> current = head;
        while (current != null) {
            if (current.data == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(MyNode<Integer> preNode, int newData) {
        if (preNode == null) {
            System.out.println("Previous node not null");
            return;
        }
        MyNode<Integer> newNode = new MyNode<>(newData);
        newNode.next = preNode.next;
        preNode.next = newNode;


    }


    public void delete(int key)
    {
        MyNode<Integer> current = head;
        MyNode<Integer> prev=null;

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

    public int size() {
        int count = 0;
        MyNode<Integer> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    private static void insertNodeBetween(MyNode<Integer> previousNode, MyNode newNode, MyNode nextNode) {
        previousNode.next = newNode;
        newNode.next = nextNode;
    }


    private static void pop(LinkedList<MyNode<Integer
            >> LinkedList) {
        LinkedList.removeLast();
    }

    static class SortedLinkedList<T extends Comparable<T>> {
        private MyNode<T> head;

        public void add(T data) {
            MyNode<T> newNode = new MyNode(data);
            if (head == null || head.data.compareTo(data) > 0) {
                newNode.next = head;
                head = newNode;
            } else {
                MyNode<T> current = head;
                while (current.next != null && current.next.data.compareTo(data) < 0) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        public void display() {
            MyNode<T> current = head;
            while (current != null) {
                System.out.println(current.data + "->");
                current = current.next;
            }
            System.out.print("null");
        }
    }






//
//
//    private static void pop(LinkedList<MyNode> linkedList)
//    {
//        linkedList.removeFirst();
//    }




    private static String getNodeSequence(LinkedList<MyNode<Integer>> linkedList) {
        StringBuilder sequence = new StringBuilder();

        for (MyNode node : linkedList) {
            sequence.append(node.data).append("->");

        }

        sequence.delete(sequence.length() - 2, sequence.length());
        return sequence.toString();

    }
}



