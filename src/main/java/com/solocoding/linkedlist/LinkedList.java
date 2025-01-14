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

        System.out.println(head == null);
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
    public void removeFirstNode() {
        if (head != null) {
            head = head.next;
        }

    }

    /**
     * Method to remove last node in the list.
     *
     * @return the removed node or null if the list is empty.
     */
    @Override
    public Node removeLastNode() {
        if (head != null) {
            if (head.next == null) {
                head = null;
                return head;
            }

            for (Node curr = head; curr != null; curr = curr.nextNode()) {

                if (curr.nextNode().nextNode() == null) {
                    curr.next = null;
                    return curr;
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
     * Method to print the list. It creates a dummy pointer and uses it to
     * travel the list.
     */
    protected void printLinkedList() {

        for (Node curr = head; curr != null; curr = curr.nextNode()) {
            System.out.print(" " + curr.getValue());
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
