package problems

//You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected
// 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
//
//The area of an island is the number of cells with a value 1 in the island.
//
//Return the maximum area of an island in grid. If there is no island, return 0.
// https://leetcode.com/problems/max-area-of-island/


class MaxAreaOfIsland {
    operator fun invoke(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { BooleanArray(grid[0].size) { false } }
        var maxArea = 0

        for (r in grid.indices) {
            for (c in grid[0].indices) {
                if (grid[r][c] == 1 && !visited[r][c]) {
                    maxArea = maxOf(maxArea, calculateArea(grid, r, c, visited))
                }
            }
        }
        return maxArea
    }

    fun calculateArea(grid: Array<IntArray>, row: Int, column: Int, visited: Array<BooleanArray>): Int {

        if (row < 0 || column < 0 || row >= grid.size || column >= grid[0].size || visited[row][column] || grid[row][column] == 0) {
            return 0
        }

        visited[row][column] = true
        return 1 +
                calculateArea(grid, row - 1, column, visited) +
                calculateArea(grid, row + 1, column, visited) +
                calculateArea(grid, row, column - 1, visited) +
                calculateArea(grid, row, column + 1, visited)

    }
}