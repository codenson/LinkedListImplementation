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

## **Usage:** <br>

### 1 - Create a LinkedList object: <br>
<sub>
LinkedList list = new LinkedList();<br>
</sub>

### 2 - Insert nodes:<br>
<sub>
list.insertNode(10);<br>
list.insertNode(20);<br>
list.insertNode(30);<br>
</sub>

### 3 - Find a node by value:<br>
<sub>

Node foundNode = list.findNode(20);<br>
if (foundNode != null) {
    System.out.println("Node found with value: " + foundNode.value);
}
</sub>
### 4- Remove the first node:
<sub>
list.removeFirstNode();
</sub>
### 5 - Remove the last node:
<sub>
Node removedNode = list.removeLastNode();
if (removedNode != null) {
    System.out.println("Removed node: " + removedNode.value);
}
</sub>
### 6- Remove a node by value:
<sub>
Node removedNode = list.removeByValue(20);
if (removedNode != null) {
    System.out.println("Removed node with value: " + removedNode.value);
}
</sub>
### 7 - Get the size of the list:
<sub>
int size = list.listSize();
System.out.println("List size: " + size);
</sub>


## **Notes:**
More Linked list mapipulation methods are coming. 
