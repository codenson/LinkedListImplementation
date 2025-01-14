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

        list.insertNode(0);
        list.insertNode(1);
        list.insertNode(2);
        list.insertNode(3);
        list.insertNode(4);
        list.insertNode(5);
        list.insertNode(6);
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

        list.printLinkedList();

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

        int count = list.listSize() - 2;

        assertEquals(7, list.listSize());

        for (int i = list.listSize() - 1; i > 0; i--) {
            assertEquals(count--, list.removeLastNode().getValue());

        }
        assertSame(null, list.getHead().nextNode());
        assertNotNull(list.getHead());
        assertEquals(0, list.getHead().getValue());
        //assertEquals(0, list.removeLastNode().valGetter()); 
        assertSame(null, list.removeLastNode());
        assertSame(null, list.removeLastNode());

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

}
