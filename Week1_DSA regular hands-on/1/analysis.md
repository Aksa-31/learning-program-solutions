(a)Analyze the time complexity of each operation (add, update, delete) in your chosen data structure.

In our inventory management system, we chose HashMap to store the products using their productId as the key. This decision allows us to perform the most important operations — adding, updating, and deleting products — very efficiently.

-Add Operation:
When we add a new product using inventory.put(productId, product), it takes on average O(1) time. This means that no matter how many products are already stored, the time it takes to add a new one remains nearly constant.

-Update Operation:
To update a product, we first fetch it using inventory.get(productId), which also takes O(1) time. Updating the product’s fields (like quantity or price) is a direct assignment and is done instantly.

-Delete Operation:
Deleting a product by ID using inventory.remove(productId) also takes O(1) on average, since HashMap directly jumps to the key and removes it.

(b)Discuss how you can optimize these operations.
While HashMap already gives us excellent performance, there are a few ways we can make the system even more robust:

-Input Validation:
Before adding or updating a product, we check if the input is valid (e.g., quantity should not be negative, product ID should not be empty).
This avoids unnecessary operations or errors.

-Better Hash Function (internally):
HashMap uses hashing to find where to store data. Ensuring that the keys (product IDs) are well-distributed and not repetitive helps reduce the chances of collisions, which maintains the O(1) performance.

-Switch to TreeMap if Sorting is Needed:
If we want products in sorted order by ID, we could switch to TreeMap. Although it’s slightly slower (O(log n)), it avoids needing a separate sorting operation later.

-Use ConcurrentHashMap for Multi-threaded Environments:
If the system ever runs in a multi-user or real-time environment, using ConcurrentHashMap would ensure safe and efficient concurrent operations.