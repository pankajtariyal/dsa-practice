# Contains Duplicate

## LeetCode
- Problem: https://leetcode.com/problems/contains-duplicate/description/
- Submission1: https://leetcode.com/problems/contains-duplicate/submissions/1920244206/
- Submission2: https://leetcode.com/problems/contains-duplicate/submissions/1920236815/

## What to do
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Input
- `nums = [1, 2, 3, 1]`

## Output
- `true`

## Approach (my words)
I solved this using a HashMap:

### HashMap (check duplicates while iterating)
- Create a HashMap to track which numbers have already appeared.
- Traverse the array:
    - If the current number is already present in the map, it means it's a duplicate → return `true`.
    - Otherwise, store the number in the map and continue.
- If the loop finishes without finding any repeated value, return `false`.

> Note: While writing the solution, make sure you check `map.containsKey(nums[i])` (the value),
> not `map.containsKey(i)` (the index).

## Complexity
- Time: `O(n)`
- Space: `O(n)`

## Edge cases
- Single element array (e.g., `[1]` → `false`)
- All unique elements (e.g., `[1,2,3,4]` → `false`)
- Multiple duplicates (e.g., `[1,1,1,3,3,4,3,2,4,2]` → `true`)
- Negative numbers (e.g., `[-1, -1]` → `true`)

## Test cases
1) Input: `nums = [1,2,3,1]` → Output: `true`
2) Input: `nums = [1,2,3,4]` → Output: `false`
3) Input: `nums = [1]` → Output: `false`
4) Input: `nums = [1,1]` → Output: `true`
5) Input: `nums = [-1,-1]` → Output: `true`  
