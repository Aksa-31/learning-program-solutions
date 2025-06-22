a) Analyze the time complexity of each operation.

In a singly linked list, adding a new task at the end takes O(n) time because you have to start from the head and move through each node to find the end.
Searching for a task also takes O(n), since there’s no direct access like in arrays—you must check one node at a time.
Traversing the list to display all tasks is O(n) as well, because every node must be visited once.
Deleting a task requires first finding the node before the one you want to delete, which again takes O(n) in the worst case.
So all basic operations in a singly linked list have a linear time complexity unless optimizations like tail pointers are used.

b)Discuss the advantages of linked lists over arrays for dynamic data.

Linked lists are better than arrays when you're working with data that changes frequently.
In arrays, you must define the size ahead of time and shift elements around when adding or removing items, which is inefficient.
Linked lists, on the other hand, allow you to easily insert or delete elements at any position without affecting the rest of the list.
They grow and shrink as needed, using memory more efficiently for dynamic data. This makes them ideal for applications like task managers,
where the number of tasks can vary and changes need to happen quickly.