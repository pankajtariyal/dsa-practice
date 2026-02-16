# 189. Rotate Array — Java (In-Place)

This solution rotates an integer array `nums` to the **right** by `k` steps using an **in-place** approach.

---

## LeetCode
- **Problem:** https://leetcode.com/problems/rotate-array/
- **Submission:** https://leetcode.com/problems/rotate-array/submissions/1921368713/

---

## Problem
Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is non-negative.

### Example
**Input:**
```text
nums = [1,2,3,4,5,6,7], k = 3
```

**Output:**
```text 
[5,6,7,1,2,3,4]
```

# Approach (In-Place): Reverse Method
**Key Idea**
- Right rotation by k can be achieved by reversing parts of the array:

 - Normalize k
- k = k % n (where n = nums.length) to handle large rotations.
- Reverse the whole array
- Brings the last k elements toward the front (but reversed).
- Reverse the first k elements
- Restores correct order for the front part.
- Reverse the remaining n - k elements
- Restores correct order for the remaining part.

**Why it Works (Intuition)
Split the array into two parts:**
- A = first n - k elements
- B = last k elements
- Right rotation is: A B → B A

**Reversing**:
- Reverse all: A B → reverse(B) reverse(A)
- Reverse first k: reverse(B) → B
- Reverse remaining: reverse(A) → A

Result becomes B A, which is the rotated array.

**Step-by-step Dry Run**
- Array: `[1, 2, 3, 4, 5, 6, 7]`, k = 3
- Reverse entire array `[7, 6, 5, 4, 3, 2, 1]`
- Reverse first k = 3 `[5, 6, 7, 4, 3, 2, 1]`
- Reverse remaining n-k = 4 `[5, 6, 7, 1, 2, 3, 4]` 
- ✅ done.

**Complexity**
- Time: O(n)
- Space: O(1) (in-place)

**Notes:**
- This is the most common optimal solution for interviews.
- Another optimal approach is cycle replacement (also O(n) / O(1)), but the reverse method is simpler to implement and explain.