1)Explain the different types of linked lists (Singly Linked List, Doubly Linked List)

Linked lists are a type of data structure used to store elements in a sequence, just like arrays.
But unlike arrays, the elements in a linked list (called nodes) are not stored in consecutive memory locations.
Instead, each node contains data and a reference (or pointer) to the next node in the list. This makes it easier to insert or remove elements without shifting others around, which is very useful when working with dynamic data.
There are mainly two types of linked lists you'll come across: Singly Linked List and Doubly Linked List.
-Singly Linked List is the simpler version. Each node has two parts: the data and a pointer to the next node.
It starts from a head node and moves one way — from the beginning to the end. You can't go backwards in a singly linked list, so if you want to delete the last node or access a previous one, you have to start again from the head and move forward step by step.
-Doubly Linked List is more flexible. Each node has three parts: the data, a pointer to the next node, and a pointer to the previous node.
This allows you to move forward and backward through the list easily.
It’s especially useful when you need to traverse in both directions or quickly remove elements from the middle.
However, it also takes slightly more memory because each node stores an extra pointer.