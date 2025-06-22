4.Analysis:
(a) Discuss the time complexity of your recursive algorithm.

- Recursive method has time complexity O(n) — it calls itself `n` times.
- Iterative method also has time complexity O(n) — loop runs `n` times.

(b) Explain how to optimize the recursive solution to avoid excessive computation.

Recursive solutions, while elegant, can lead to performance issues such as stack overflow when the recursion depth becomes large. 
To optimize the recursive approach:
- Use iteration to eliminate function call overhead and reduce memory usage.
- Alternatively, apply memoization if intermediate results are reused (not applicable here, but useful in recursive problems like Fibonacci).
- In simple cases like exponentiation, use the Math.pow() function for better efficiency and readability.