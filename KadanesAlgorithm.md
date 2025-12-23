# Kadane’s Algorithm – Conceptual Notes

## What Problem It Solves
Kadane’s Algorithm is used to find the **maximum sum of a contiguous subarray** in a one-dimensional array of integers.

**Key word:** contiguous (elements must be adjacent).

---

## Core Idea (Intuition)
At every index, we make a simple decision:

- Start a **new subarray** at the current element  
- OR continue the **previous subarray**

If the previous sum is negative, it will only reduce future sums, so it is better to **discard it** and start fresh.

> Negative running sums are never helpful for maximizing future subarrays.

---

## Mental Model
Think of walking through the array while carrying a bag (running sum):

- If the bag becomes **negative**, it’s a burden → throw it away
- Start a new bag from the current element
- Keep track of the **heaviest bag** you ever carried (maximum sum)

---

## Key Assumptions
- The array contains **at least one element**
- The subarray must be **non-empty**
- Elements can be **positive, negative, or zero**
- We are maximizing **sum**, not length

---

## Why Kadane’s Works
Kadane’s Algorithm combines:
- **Greedy approach** → makes the best local decision at each step
- **Dynamic Programming** → uses the result from the previous index

The best subarray ending at index `i` depends only on the best subarray ending at `i−1`.

This local decision process leads to the global optimum.

---

## Recognizing the Pattern
Kadane’s Algorithm should immediately come to mind when you see:
- “Maximum subarray”
- “Largest sum of contiguous elements”
- “Subarray with maximum/minimum sum”

Similar patterns appear in:
- Maximum product subarray
- Circular subarray sum
- Stock buy/sell problems
- Accumulation problems with resets

---

## Important Edge Cases
### All Numbers Are Negative
- The answer is the **largest (least negative) element**
- Initializing max sum to `0` is incorrect in this case

---

## Things to Pay Attention To
- Reset the running sum **only when starting fresh is better**
- Always update the global maximum after updating the running sum
- Do not confuse **subarray** with **subsequence**
- Order of operations matters

---

## Common Mistakes
- Assuming empty subarray is allowed
- Resetting sum too aggressively
- Forgetting the all-negative case
- Mixing up contiguous vs non-contiguous elements

---

## One-Line Explanation
> “At each index, we decide whether to start a new subarray or extend the existing one, while tracking the maximum sum seen so far.”

---

## When NOT to Use Kadane’s
- When subarrays are not required to be contiguous
- When counting subarrays instead of maximizing sum
- When constraints involve exact sums (e.g., sum = k)

---

## Summary
Kadane’s Algorithm is an optimal **O(n)** solution for finding the maximum subarray sum using a greedy and dynamic programming approach. Its power lies in making simple local decisions that lead to a global optimum.
