# Rotate an Array Using the Reversal Algorithm

## Problem Overview
Given an integer array `nums` and a non-negative integer `k`, rotate the array to the **right** by `k` steps.

### Example
**Input:** `nums = [1,2,3,4,5,6,7]`, `k = 3`  
**Output:** `[5,6,7,1,2,3,4]`

The last `k` elements move to the front, and the remaining elements shift to the right.

---

## Key Idea (Thought Process)

Instead of rotating the array one step at a time (which is inefficient), we use the **reversal algorithm**.

A right rotation by `k` steps can be broken into three reversals:
1. Reverse the entire array
2. Reverse the first `k` elements
3. Reverse the remaining `n - k` elements

This rearranges the array in-place and simulates rotation efficiently.

---

## Algorithm

1. Compute `k = k % n` to handle cases where `k` is larger than the array length.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining elements from index `k` to `n - 1`.

---

## Java Implementation

```java
class Solution {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        // Optimization for cases where k >= n
        k = k % len;

        // 1. Reverse the entire array
        reverse(nums, 0, len - 1);

        // 2. Reverse the first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse the remaining elements
        reverse(nums, k, len - 1);
    }

    public static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
```

## Step-by-Step Example

For `nums = [1,2,3,4,5,6,7]` and `k = 3`:

1. **Reverse entire array:**  

2. **Reverse first `k` (3) elements:**  

3. **Reverse remaining elements:**  


---

## Time and Space Complexity

- **Time Complexity:** `O(n)`  
Each element is processed a constant number of times across all reversals.

- **Space Complexity:** `O(1)`  
The rotation is done in-place without using extra memory.

---

## Key Things to Remember

- Always reduce `k` using `k % n`
- This approach performs rotation **in-place**
- Much more efficient than rotating one step at a time
- Commonly asked pattern in coding interviews

---

## Edge Cases

- `k = 0` → Array remains unchanged  
- `k = n` → Array remains unchanged  
- Single-element array → No change  

