# Two Sum

## LeetCode
- Problem: https://leetcode.com/problems/two-sum/description/
- Submission (Brute Force): https://leetcode.com/problems/two-sum/submissions/1906582879/
- Submission (HashMap): https://leetcode.com/problems/two-sum/submissions/1920209083/

## What to do
Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Input
- `nums = [2, 7, 11, 15]`
- `target = 9`

## Output
- `[0, 1]`

## Approach (my words)
I solved this problem in two ways:

### 1) Brute Force
- Use two loops.
- The outer loop picks one element (example: `2`).
- The inner loop checks every next element and adds it to the outer element.
- If the sum matches the target, return the outer and inner indices.

### 2) HashMap
- Use a HashMap to store: **number → index**
- For each element `nums[i]`, calculate `need = target - nums[i]`.
- If `need` already exists in the map, return `[map.get(need), i]`.
- Otherwise, store `nums[i]` with its index in the map.

## Complexity
- Time: `O(n)` (HashMap approach)
- Space: `O(n)`

## Edge cases
- Duplicate values (e.g., `nums = [3,3]`, `target = 6`)
- Negative numbers (e.g., `nums = [-3,4,3,90]`, `target = 0`)
- Zeros (e.g., `nums = [0,4,3,0]`, `target = 0`)

## Test cases
1) Input: `nums = [2,7,11,15]`, `target = 9` → Output: `[0,1]`
2) Input: `nums = [3,2,4]`, `target = 6` → Output: `[1,2]`
3) Input: `nums = [3,3]`, `target = 6` → Output: `[0,1]`  
