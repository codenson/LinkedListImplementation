/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.solocoding.linkedlist;

/**
 * Linked List implementation from scratch.
 *
 * @author guero
 */
public class LinkedList implements LinkedListInterface {

    /**
     * Head of the list.
     */
    private Node head;

    /**
     * Getter to return head of the list.
     *
     * @return head.
     */
    public Node getHead() {
        return head;
    }

    /**
     * Method to iterate through the list
     *
     * @return the size of the list.
     */
    @Override
    public int listSize() {
        int counter = 0;

        for (Node curr = head; curr != null; curr = curr.nextNode()) {

            counter++;
        }
        return counter;

    }

    /**
     * Method to reset the list to null for testing purposes.
     */
    public void resetList() {
        head = null;
    }

    /**
     * Method to add/insert elements into the list. If the list is empty, it
     * adds the first node If the list is not empty, it travels the list till
     * the end and inserts the new value.
     *
     * @param val data to be inserted.
     */
    @Override
    public void insertNode(int val) {

        if (head == null) {
            head = new Node(val);
            return;
        }
        Node curr = head;

        while (curr.next != null) {
            curr = curr.nextNode();
        }
        curr.setNextNode(new Node(val));

        return;

    }

    /**
     * Method to find a node in the list.
     *
     * @param val data of the node searched for.
     * @return true if the node exists in the list, otherwise false.
     */
    @Override
    public Node findNode(int val) {

        for (Node curr = head; curr != null; curr = curr.nextNode()) {
            if (curr.getValue() == val) {
                return curr;
            }

        }

        return null;

    }

    /**
     * Method to remove the first node of the list if the list isn't empty.
     */
    @Override
    public Node removeFirstNode() {
        Node removedNode = null;
        if (head != null) {
            removedNode = head;
            head = head.next;
        }
        return removedNode;

    }

    /**
     * Method to remove last node in the list.
     *
     * @return the removed node or null if the list is empty.
     */
    @Override
    public Node removeLastNode() {
        if (head != null) {
            if (head.next == null || head.next == null) {
                Node removednode = head;
                head = null;
                return removednode;
            }

            for (Node curr = head; curr != null; curr = curr.nextNode()) {

                if (curr.nextNode().nextNode() == null) {
                    Node removednode = curr.next;
                    curr.next = null;
                    return removednode;
                }
            }

        }
        return null;
    }

    /**
     * Method iterates through the list to find and remove a node by value.
     *
     * @param val the value to be removed from the list.
     * @return the deleted node, otherwise null if not found.
     */
    @Override
    public Node removeByValue(int val) {

        Node prevNode = null;
        if (head == null) {
            return null;
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            if (curr.value == val) {
                if (prevNode == null) {
                    prevNode = curr;
                    if (curr.next != null) {
                        head = head.next;

                        return prevNode;

                    } else {
                        head = null;
                        return prevNode;

                    }
                } else {
                    if (curr.nextNode() == null) {
                        prevNode.next = null;
                        return curr;

                    } else {
                        prevNode.next = curr.next;
                        return curr;
                    }

                }

            }
            prevNode = curr;
        }

        return null;

    }

    /**
     * Method to reverse the list.
     *
     * @param currNode The head of the list to be reversed.
     */
    @Override
    public void reverseList(Node currNode) {

        Node newHead = null;

        Node tail = null;
        while (currNode != null) {

            if (newHead == null) {
                newHead = tail = new Node(currNode.value);
            } else {
                Node temp = new Node(currNode.value);
                newHead = temp;
                newHead.next = tail;
                tail = newHead;

            }

            currNode = currNode.next;

        }

        head = newHead;

    }
    /**
     * Method to print even nodes from the linked list. 
     * @param currNode the head of the list. 
     */
    @Override
    public void printEvenNodes(Node currNode){
        int counter = 0; 
        for (Node curr = currNode; curr != null; curr = curr.next){
            if ((counter++)%2 == 0){
                System.out.println("Node : " + curr.getValue());
            
            }
        
        }
    }

    /**
     * Method to print the list. It creates a dummy pointer and uses it to
     * travel the list.
     */
    protected void printLinkedList() {

        for (Node curr = head; curr != null; curr = curr.nextNode()) {
            System.out.println(" " + curr.getValue());
        }

    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Nodes for the linked List.
     */
    protected class Node {

        /**
         * Value to be inserted into the node.
         */
        private int value;
        /**
         * Next node.
         */
        private Node next;

        /**
         * Constructor for the class.
         *
         * @param value data for the node.
         */
        public Node(int value) {
            this.value = value;
        }

        /**
         * Setter for the node.
         *
         * @param value value to be inserted into the node.
         */
        public void setValue(int value) {
            this.value = value;
        }

        /**
         * method to connect this node with other nodes.
         *
         * @param nextNode a neighboring node to be connected the current one.
         */
        public void setNextNode(Node nextNode) {
            this.next = nextNode;
        }

        /**
         * Node's data getter.
         *
         * @return this value.
         */
        public int getValue() {
            return this.value;
        }

        /**
         * method to get next neighboring node.
         *
         * @return the next node connected to this one.
         */
        public Node nextNode() {
            return next;
        }

    }
}
