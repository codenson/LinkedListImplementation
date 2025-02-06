/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.solocoding.linkedlist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author guero
 */
public class LinkedListTest {

    public static LinkedList list = new LinkedList();

    public LinkedListTest() {
    }

    @BeforeAll
    public static void setUpClass() {

    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

        for (int i = 0; i < 7; i++) {
            list.insertNode(i);
        }
    }

    @AfterEach
    public void tearDown() {
        list.resetList();
    }

    /**
     * Test of main method, of class LinkedList.
     */
    @Test
    public void testMain() {
    }

    @Test
    public void testInsertNode() {
        assertEquals(list.findNode(0).getValue(), 0);
        assertEquals(list.findNode(2).getValue(), 2);
        assertEquals(list.findNode(6).getValue(), 6);
        assertNull(list.findNode(20));

        //list.printLinkedList();

    }

    @Test
    public void testRemoveFirstNode() {

        list.removeFirstNode();
        assertEquals(list.getHead().getValue(), 1);
        list.removeFirstNode();
        assertEquals(list.getHead().getValue(), 2);
        list.removeFirstNode();
        assertEquals(list.getHead().getValue(), 3);
        list.removeFirstNode();
        assertEquals(list.getHead().getValue(), 4);
        list.printLinkedList();

        list.resetList();
        assertNull(list.getHead());
        list.removeFirstNode();

    }

    @Test
    public void testRemoveLastNode() {

        int count = list.listSize() - 1;

        assertEquals(7, list.listSize());

        for (int i = list.listSize() - 1; i > 0; i--) {
            assertEquals(count--, list.removeLastNode().getValue());

        }
        assertSame(0, list.getHead().getValue(), "Head should carry value : 0 ");
        assertEquals(0, list.removeLastNode().getValue());

        assertNull(list.getHead());

        list.resetList();

        list.insertNode(0);
        list.insertNode(1);
        list.insertNode(2);

        assertEquals(2, list.removeLastNode().getValue());
        assertEquals(2, list.listSize());
        list.resetList();
        setUp();

        int c = list.listSize() - 1;
        for (int i = c; i >= 0; i--) {
            assertEquals(i, list.removeLastNode().getValue());
        }
        assertNull(list.getHead(), "List should be empty here. ");

        setUp();
        list.insertNode(2);
        list.printLinkedList();
        assertEquals(2, list.removeLastNode().getValue());

        assertNotNull(list.getHead());

    }

    @Test
    public void testRemoveByValue() {

        list.getHead().setNextNode(null);
        assertEquals(0, list.removeByValue(0).getValue());
        assertNull(list.getHead());

        list.resetList();
        this.setUp();
        assertEquals(0, list.removeByValue(0).getValue());
        assertEquals(1, list.getHead().getValue());

        assertEquals(3, list.removeByValue(3).getValue());
        assertNull(list.findNode(3));

        assertEquals(6, list.removeByValue(6).getValue());
        assertNull(list.findNode(6));
        assertNull(list.removeByValue(500));

        assertEquals(5, list.removeByValue(5).getValue());
        assertNull(list.findNode(5));

        list.resetList();
        assertNull(list.removeByValue(5), "The List should be empty.");

    }

    @Test

    public void testreverseList() {
        list.reverseList(list.getHead());
        assertNotEquals(0, list.getHead().getValue());
        assertEquals(6, list.getHead().getValue());
        assertEquals(7, list.listSize());

        int listSize = list.listSize();

        for (int i = listSize; i > 0; i--) {

            assertEquals(i - 1, list.removeFirstNode().getValue());

        }
        assertNull(list.getHead());

        for (int i = 0; i < 2000; i++) {
            list.insertNode(i);
        }
        list.reverseList(list.getHead());
        assertEquals(1999, list.getHead().getValue());
        assertEquals(2000, list.listSize());

        list.reverseList(list.getHead());
        assertEquals(0, list.getHead().getValue());
        assertEquals(2000, list.listSize());

        list.reverseList(list.getHead());
        assertEquals(1999, list.getHead().getValue());
        assertEquals(1999, list.getHead().getValue());
        list.printLinkedList();
        listSize = list.listSize() - 1;
        for (int i = 0; i <= listSize; i++) {
            assertEquals(i, list.removeLastNode().getValue());
        }

        assertNull(list.getHead(), "List should be empty here. ");

        assertNull(list.removeLastNode(), "The list is Empty.");
        list.reverseList(list.getHead());
        assertNull(list.getHead());

    }
    @Test 
    public void testEvenNodes(){
       
        list.printEvenNodes(list.getHead());
    
    }

}
