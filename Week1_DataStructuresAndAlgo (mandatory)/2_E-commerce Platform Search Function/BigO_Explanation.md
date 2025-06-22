Exercise 2: E-commerce Platform Search Function

1.Understand Asymptotic Notation:
(a)Explain Big O notation and how it helps in analyzing algorithms.

Big O notation is a mathematical way to describe how the performance of an algorithm changes as the size of the input grows.
It helps us analyze the efficiency of algorithms by focusing on their growth rate, not the exact time.
Big O tells us the worst-case scenario of how much time (or space) an algorithm might take, helping developers compare which algorithm is better, especially for large inputs.
For example a linear search takes O(n) time because it checks each item one by one, while binary search takes only O(log n) time by dividing the list in half at each step — making it much faster for big data.

(b)Describe the best, average, and worst-case scenarios for search operations.

Best Case:
- This is the fastest possible scenario.
- The element is found immediately or early.
- For example:
  - In Linear Search: the target is at the first index → Time: O(1)
  - In Binary Search: the target is right in the middle → Time: O(1)

Average Case:
- The element might be somewhere in the middle of the data.
- It helps us estimate a realistic performance.
- Example:
  - Linear Search: element found halfway → Time: O(n)
  - Binary Search: continues halving → Time: O(log n)

Worst Case:
- This is the slowest scenario, which helps us plan for the worst.
- The element is at the last position or not found at all.
- Example:
  - Linear Search: checks all elements one by one → Time: O(n)
  - Binary Search: keeps dividing until 1 element left → Time: O(log n)

