package com.bridgelabz.linkedlist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class LinkedListSearchTest {
    @Test

    public void testSearch() {
        CreateLinkedlist list = new CreateLinkedlist();

        // Insert elements into the linked list
        list.insert(56);
        list.insert(30);
        list.insert(70);

        // Test searching for node with value 30
        MyNode node30 = list.search(30);
        assertNotNull("Node with value 30 should be found", node30);
        assertEquals("Found node should have data value 30", 30, node30.data);

        list.insertAfter(node30, 40);


        MyNode current = list.head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }
}
