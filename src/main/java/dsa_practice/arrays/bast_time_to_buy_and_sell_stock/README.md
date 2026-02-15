# Best Time to Buy and Sell Stock

## LeetCode
- Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
- Submission: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1920278302/

## What to do
You are given an array `prices` where `prices[i]` is the price of a given stock on the `i`th day.

Find the maximum profit you can achieve by choosing **one day to buy** and choosing a **different day in the future to sell**.

Return the maximum profit. If you cannot achieve any profit, return `0`.

## Input
- `prices = [7, 1, 5, 3, 6, 4]`

## Output
- `5`

## Approach (my words)
I solved this in one pass by tracking:
- the **minimum price so far** ( the best day to buy)
- the **maximum profit so far**

Steps:
- Start with the first day price as `basePrice` (minimum price so far).
- Traverse the array from day 2 onwards:
    - If the current price is smaller than `basePrice`, update `basePrice` (better buying price found).
    - Otherwise, calculate profit if we sell today: `currentPrice - basePrice`.
    - Update `profit` if this profit is greater than the current maximum profit.
- Return `profit`.

This ensures the buy day always comes before the sell day because `basePrice` is taken from earlier days.

## Complexity
- Time: `O(n)`
- Space: `O(1)`

## Pitfalls & Edge cases
- Prices always decreasing → profit should be `0` (e.g., `[7,6,4,3,1]`)
- Only one day available → profit `0` (e.g., `[5]`)
- Buy must be before sell (not allowed to sell first)
- Don’t confuse with the “multiple transactions” version (this is only one buy + one sell)
- Large `k` not applicable here (just ensure one pass)

## Test cases
1) Input: `prices = [7,1,5,3,6,4]` → Output: `5`
2) Input: `prices = [7,6,4,3,1]` → Output: `0`
3) Input: `prices = [2,4,1]` → Output: `2`
4) Input: `prices = [1,2]` → Output: `1`
5) Input: `prices = [5]` → Output: `0`  
