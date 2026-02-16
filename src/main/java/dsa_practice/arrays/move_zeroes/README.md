# Move Zeroes (Two Pointers: Slow & Fast) — Java

This solution moves all `0`s to the end of the array **in-place** while maintaining the **relative order** of non-zero elements using the **Two Pointers (slow/fast)** technique.

---

## LeetCode
- Problem: https://leetcode.com/problems/move-zeroes/
- Submission: https://leetcode.com/problems/move-zeroes/submissions/1921192006/

## Problem
Given an integer array `nums`, move all `0`s to the end **in-place** and keep the order of non-zero elements unchanged.

### Example
Input:
```text
[0, 1, 0, 3, 12]
```

Output:
```text
[1, 3, 12, 0, 0]
```


# Approach: Two Pointers (Slow / Fast)
- Idea
- fast scans the array from left to right.
- slow tracks the position where the next non-zero element should be placed.
- Whenever nums[fast] != 0, we swap nums[fast] with nums[slow], then increment slow.
- This moves non-zero elements forward and pushes zeroes toward the end automatically.

# Step-by-step Dry Run
- Array: [0, 1, 0, 3, 12]
- slow=0, fast=0 → nums[0]=0 → skip
- slow=0, fast=1 → nums[1]=1 → swap with nums[0] → [1, 0, 0, 3, 12], slow=1
- slow=1, fast=2 → nums[2]=0 → skip
- slow=1, fast=3 → nums[3]=3 → swap with nums[1] → [1, 3, 0, 0, 12], slow=2
- slow=2, fast=4 → nums[4]=12 → swap with nums[2] → [1, 3, 12, 0, 0], slow=3
- Done ✅

# Complexity
- Time: O(n) (single pass)
- Space: O(1) (in-place)

Java Solution:
```text
class Solution {
public void moveZeroes(int[] nums) {
if (nums.length <= 1) return;

        int slow = 0;
        int fast = 0;

        while (fast < nums.length) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }
}

```

**Notes:**
- This solution keeps the relative order of non-zero numbers.
- If slow == fast, the swap still works (it swaps an element with itself).
- This is a classic use of two pointers for in-place filtering / partitioning.