# **LinkedList Implementation in Java** <br>
This project demonstrates the implementation of a basic linked list in Java. It includes fundamental operations such as inserting nodes, removing nodes, and searching for specific nodes.
The implementation is based on a custom LinkedList class, which is defined using the LinkedListInterface.<br>

## **Description**<br>
This Java project implements a simple Linked List data structure. A linked list is a linear data structure where each element (node) contains a reference (or link) to the next node in the sequence. 
This implementation provides basic linked list operations, including insertion, removal, and searching for elements.<br>

## **Key Components:**<br>
LinkedList: A class implementing the linked list functionality.<br>
LinkedListInterface: An interface defining the contract for linked list operations.<br>
Node: A class representing an individual node in the linked list, containing a value and a reference to the next node.<br>
## **Features** <br>
Insert a node: Allows insertion of a new node at the end of the list.<br>
Remove the first node: Removes the node at the head of the list.<br>
Remove the last node: Removes the node at the tail of the list.<br>
Remove a node by value: Removes a node based on a specific value.<br>
Find a node by value: Searches the list for a node containing a specific value.<br>
List size: Returns the number of nodes in the list.<br>

## **Usage:** <br><sub>
### 1 - Create a LinkedList object: <br>

LinkedList list = new LinkedList();<br>

### 2 - Insert nodes:<br>
list.insertNode(10);<br>
list.insertNode(20);<br>
list.insertNode(30);<br>

### 3 - Find a node by value:<br>

Node foundNode = list.findNode(20);<br>
if (foundNode != null) {
    System.out.println("Node found with value: " + foundNode.value);
}

### 4- Remove the first node:

list.removeFirstNode();

### 5 - Remove the last node:

Node removedNode = list.removeLastNode();
if (removedNode != null) {
    System.out.println("Removed node: " + removedNode.value);
}

### 6- Remove a node by value:

Node removedNode = list.removeByValue(20);
if (removedNode != null) {
    System.out.println("Removed node with value: " + removedNode.value);
}

### 7 - Get the size of the list:

int size = list.listSize();
System.out.println("List size: " + size);
</sub>


## **Notes:**
More Linked list mapipulation methods are coming. 
