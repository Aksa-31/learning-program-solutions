1)Compare the performance (time complexity) of Bubble Sort and Quick Sort.

Bubble Sort : is a simple comparison-based algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
While it's easy to understand and implement, it is very inefficient for large datasets. Its time complexity is:
-Best Case (already sorted): O(n)
-Average Case: O(n²)
-Worst Case (reversed): O(n²)
Quick Sort : is a highly efficient divide-and-conquer algorithm. It works by selecting a pivot, partitioning the array around the pivot, and then recursively sorting the partitions.
Quick Sort is generally faster and more suitable for larger inputs. Its time complexity is:
-Best Case: O(n log n)
-Average Case: O(n log n)
-Worst Case: O(n²) 

2)Discuss why Quick Sort is generally preferred over Bubble Sort.

Quick Sort is generally much faster for large datasets.
Even though the worst case is O(n²), in practice, it performs better due to fewer comparisons and better use of memory cache.
Bubble Sort is mainly used for very small datasets.

