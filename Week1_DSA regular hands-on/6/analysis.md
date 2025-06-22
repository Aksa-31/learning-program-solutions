a)Compare the time complexity of linear and binary search.

-Linear search has a time complexity of O(n), meaning that in the worst case,it may need to check every element in the list to find the target.
Binary search, on the other hand, has a much better time complexity of O(log n) because it cuts the list in half with each step,significantly reducing the number of comparisons.
So, while linear search is simple and flexible, binary search is much more efficient, especially for larger datasets—provided the data is sorted.

b)Discuss when to use each algorithm based on the data set size and order.

-Use linear search when the dataset is small or unsorted. It’s also useful when sorting the data is either unnecessary or too time-consuming for one-time searches.
Linear search is easy to implement and works in all cases, regardless of order. On the other hand, binary search should be used when you're working with sorted data and performance matters.
For large datasets where speed is important and the data is already sorted (or can be sorted once and reused), binary search is the better choice due to its faster execution.