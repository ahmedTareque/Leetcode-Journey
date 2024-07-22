# Number_Of_Island
LeetCode Number Of Island Problem solution in Java

Question - 
Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

 

Example 1:

Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
Example 2:

Input: grid = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3

![Question](question.png?raw=true "Question")

//Solution Logic:
1. Using DFS while look for '1' in 1st row.
2. If '1' is found increase island number and make it '0' 
3. Then look around [up,down,left,right] to find more '1' and make it '0' everytime.
4. Then go for 2nd row and repeat