1)Analyze the time complexity of each operation (add, search, traverse, delete).

-Each operation has its own time complexity based on how arrays work internally.
Adding an employee to the array is quite efficient and takes constant time or O(1), because the new employee is simply placed in the next available slot (at the end of the array).
However, this efficiency only holds as long as there is space in the array.Searching for an employee is done by scanning through each element from the beginning to the end until a match is found.
Since the array is not sorted or indexed in any special way, this results in a linear time complexity of O(n), where n is the number of employees currently stored.
Traversing the employee array, such as for displaying all employees, also requires visiting each element once. This makes the traversal operation O(n) as well,
since it depends on the total number of employees.
Deleting an employee is the most complex among these operations.First,the array needs to be searched to find the employee (which is O(n)),
and then all elements after the deleted one must be shifted one position to the left to fill the gap.
This shifting process also takes O(n) in the worst case, especially if the deleted employee is near the beginning of the array.
Therefore, the total time complexity for deletion is also O(n).

2)Discuss the limitations of arrays and when to use them.

-Arrays have a fixed size, which means you must define the number of elements in advance.
This can lead to wasted memory if the array is too large, or errors if it’s too small.
Inserting or deleting elements in the middle is also inefficient, as it requires shifting other elements, making these operations slower.
Arrays don’t resize automatically and lack built-in methods for dynamic changes.
However,they are ideal when the data size is known and doesn't change much, and when you need fast access to elements using their index.

