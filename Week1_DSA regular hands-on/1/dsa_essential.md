1.Understand the Problem:
(a) Explain why data structures and algorithms are essential in handling large inventories.

In any large-scale warehouse or inventory system, thousands of products need to be added, updated, retrieved, or deleted quickly and efficiently.
Without using proper data structures and algorithms, these operations can become very slow as the data grows.
Data structures help organize information logically in memory, making it easier and faster to access or modify.
For example if we store products in a list and search for a product by ID, it would take a lot of time as we have to check each item one by one. But if we use a structure like a HashMap, we can directly jump to the required item using its ID in constant time.
Algorithms are equally important. They determine how efficiently we can perform these actions whether we’re searching for a product, sorting them by price, or checking for duplicates.
With good algorithms and structures, even very large inventories can be handled smoothly and in real-time.
data structures and algorithms are the foundation that make an inventory system scalable, responsive, and reliable.

(b)Discuss the types of data structures suitable for this problem

HashMap:
Ideal for storing products where each product has a unique productId. It allows us to quickly access, add, update, or delete any product in constant time O(1). This is the best choice when fast lookup by ID is needed.

ArrayList:
Useful if we want to store products in an ordered list, such as for displaying them in the order they were added. But it’s slower for searching by ID because it requires going through each item.

TreeMap:
A good option if we want to keep products sorted by their IDs. Operations like add, update, and delete are slightly slower compared to HashMap, but we get automatic sorting.

LinkedList:
Not ideal for this use case, as it’s slower for searches. But can be useful if we frequently insert or remove items from both ends.

Best choice for most inventory systems:
HashMap – because it offers the best performance for add, update, and delete operations using product ID as a key.