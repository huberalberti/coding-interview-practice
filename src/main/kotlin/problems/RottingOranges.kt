package problems
//You are given an m x n grid where each cell can have one of three values:
//
//0 representing an empty cell,
//1 representing a fresh orange, or
//2 representing a rotten orange.
//Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
//
//Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
//https://leetcode.com/problems/rotting-oranges/

class RottingOranges {

    operator fun invoke(grid: Array<IntArray>): Int {
        val queue = ArrayDeque<Pair<Int, Int>>()
        var minutes = -1
        var freshOranges = 0
        // add all the rotten apples to the queue
        for (c in grid.indices) {
            for (r in grid[0].indices) {
                if (grid[c][r] == 2) {
                    queue.addLast(Pair(c, r))
                } else if (grid[c][r] == 1) {
                    freshOranges++
                }
            }
        }

        if(queue.isEmpty() && freshOranges == 0) return 0
        // BFS
        var rottenApples: Int
        val directions = arrayOf(Pair(1, 0), Pair(-1, 0), Pair(0, 1), Pair(0, -1))
        while (queue.isNotEmpty()) {
            rottenApples = queue.size
            for (i in 0 until rottenApples) {
                val apple = queue.removeFirst()
                for (dir in directions) {
                    val x = apple.first + dir.first
                    val y = apple.second + dir.second
                    if (x >= 0 && x < grid.size && y >= 0 && y < grid[0].size && grid[x][y] == 1) {
                        grid[x][y] = 2
                        freshOranges--
                        queue.addLast(Pair(x, y))
                    }
                }
            }
            minutes ++
        }
        if (freshOranges > 0) {
            return -1
        }
        return minutes
    }
}