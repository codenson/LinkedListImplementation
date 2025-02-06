/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.solocoding.linkedlist;

import com.solocoding.linkedlist.LinkedList.Node;

/**
 * Interface to implement Linked list.
 *
 * @author guero
 */
public interface LinkedListInterface {

    /**
     * Method to get list size.
     *
     * @return the size of the list.
     */
    int listSize();

    /**
     * Method to insert a node into the list.
     *
     * @param val the value of the node to be inserted.
     */
    void insertNode(int val);

    /**
     * Method to find if a node with specific value exists in the list.
     *
     * @param val the value to look for.
     * @return the nodes with value searched for or null if not found.
     */
    Node findNode(int val);

    /**
     * Method to remove fist node in the list.
     *
     * @return Node that was removed or Null if the list is empty.
     */
    Node removeFirstNode();

    /**
     * Method to remove the last node in the list.
     *
     * @return The node removed or null if not found.
     */
    Node removeLastNode();

    /**
     * Method to remove a node with a specific value.
     *
     * @param val the value to be removed from the list.
     * @return the node that carries the value if found, or null if the value
     * does not exist in the list.
     */
    Node removeByValue(int val);
    
    /**
     * Method to reverse the Linked list.
     * @param currNode the head of the list. 
     */
    void reverseList(Node currNode);
    
    /**
     * Method to walk through the linked list and prints even nodes. 
     * @param currNode  the head of the linked list. 
     */
    void printEvenNodes(Node currNode);

}
