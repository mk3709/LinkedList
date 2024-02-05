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
    public static void main(String[] args) {

        MyNode   myFirstNode = new MyNode(56);
        MyNode   mySecondNode = new MyNode(30);
        MyNode   myThirdNode = new MyNode(70);

        //56-30->70
        myFirstNode.next=mySecondNode;
        mySecondNode.next=myThirdNode;



        insertNodeBetween(myFirstNode,mySecondNode,myThirdNode);

        LinkedList<MyNode> l1 = new LinkedList<>();
        l1.add(myFirstNode);
        l1.add(mySecondNode);
        l1.add(myThirdNode);
        pop(l1);

        System.out.println("LinkedList " + getNodeSequence(l1));
    }

    private  static void insertNodeBetween(MyNode previousNode,MyNode newNode,MyNode nextNode)
    {
        previousNode.next=newNode;
        newNode.next=nextNode;

    }


//   // private static void pop(LinkedList<MyNode> linkedList)
//    {
//        linkedList.removeFirst();
//    }
    private static  void pop(LinkedList<MyNode> LinkedList)
    {
        LinkedList.removeLast();
    }

    private  static String getNodeSequence(LinkedList<MyNode> linkedList)
    {
         StringBuilder sequence = new StringBuilder();

      for(MyNode node:linkedList)
      {
          sequence.append(node.data).append("->");

      }

      sequence.delete(sequence.length()-2,sequence.length());
      return sequence.toString();

    }

}
