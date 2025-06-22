1)Explain how arrays are represented in memory and their advantages.

Arrays are stored in contiguous memory locations, meaning each element is placed right after the previous one.
This allows constant-time access to any element using its index.
Arrays are simple,memory-efficient no overhead like pointers,and fast for random access.
Advantages:
-Fast access using index (O(1))
-Memory locality improves cache performance
-Simple to implement