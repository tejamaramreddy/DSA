
---

#  Product of Array Except Self

##  Problem Restatement

Given an integer array `nums`, for each index `i`, compute the product of **all elements except `nums[i]`**, without using division, in **O(n)** time.

---

##  First Thought — Brute Force

For each index:

* Multiply all elements except itself

**Issue:**

* Time complexity = **O(n²)** → too slow

---

##  Second Thought — Total Product with Division

* Compute total product of all elements
* Divide by `nums[i]`

**Why this fails:**

* Division is **not allowed**
* Fails when array contains **zero**

---

## Key Insight

For each index `i`:

```
product except self =
(product of elements to the LEFT of i)
×
(product of elements to the RIGHT of i)
```

This avoids division entirely.

---

##  Breaking the Problem

###  Prefix Product

* `prefix[i]` = product of all elements **before** index `i`
* For index `0`, there are no elements on the left → use `1`

Example:

```
nums    = [1, 2, 3, 4]
prefix  = [1, 1, 2, 6]
```

---

###  Suffix Product

* `suffix[i]` = product of all elements **after** index `i`
* Instead of storing a full array, maintain a **running suffix product**

Example:

```
suffix traversal from right:
suffix = 1 → 4 → 12 → 24
```

---

## Optimized Strategy (Core Idea)

1. Use the output array to store **prefix products**
2. Traverse from right to left, keeping a variable `suffix`
3. Multiply:

   ```
   answer[i] = prefix[i] × suffix
   ```
4. Update suffix at each step

This gives:

* **O(n)** time
* **O(1)** extra space (excluding output array)

---

## Why This Works

* Every element contributes to all indices **except its own**
* Prefix handles left contribution
* Suffix handles right contribution
* Multiplying both gives the correct result

---

##  Handling Zeros

* If there is **one zero**, only one index gets a non-zero product
* If there are **multiple zeros**, all results are zero
* Prefix–suffix approach naturally handles this — no special cases needed

---

## Complexity Analysis

| Metric        | Value      |
| ------------- | ---------- |
| Time          | O(n)       |
| Space         | O(1) extra |
| Division Used | ❌ No       |

---

## Final Takeaway

> When division is not allowed, **split the product into left and right contributions**.

