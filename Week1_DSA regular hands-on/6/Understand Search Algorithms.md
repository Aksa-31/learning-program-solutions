1)Explain linear search and binary search algorithms.

-Linear search is the simplest search algorithm. It works by checking each element in the list one by one until it finds the target value or reaches the end.
It doesn’t require the list to be sorted, so it works on any type of data arrangement. However, it's not very efficient for large datasets because, in the worst case,
it might need to scan every element. The time complexity of linear search is O(n), where n is the number of elements in the list.
-Binary search is much faster but it only works on sorted data. It works by repeatedly dividing the list in half and checking whether the middle element is the target.
If not, it decides which half to search next based on whether the target is smaller or larger than the middle.
This "divide and conquer" approach reduces the number of comparisons significantly. Binary search has a time complexity of O(log n), making it far more efficient than linear search for large and sorted datasets.

