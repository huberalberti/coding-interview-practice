package leetCode

//Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
//
//The distance between two adjacent cells is 1.
//https://leetcode.com/problems/01-matrix/

class Matrix01 {
    private companion object {
        private val DIRS = intArrayOf(0, -1, 0, 1, 0)
        private const val RANGE_DATA = 1e4.toInt() + 7
    }

    operator fun invoke(mat: Array<IntArray>): Array<IntArray> {
        val nRows = mat.size
        val nCols = mat[0].size

        val queue = ArrayDeque<Cell>()
        for (row in mat.indices) {
            for (col in mat[row].indices) {
                if (mat[row][col] == 0)
                    queue.addLast(Cell(row, col))
                else
                    mat[row][col] = RANGE_DATA
            }
        }

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (sz in 0 until size) {
                val (row, col) = queue.removeFirst()

                for (d in 0 until 4) {
                    val nextRow = row + DIRS[d]
                    val nextCol = col + DIRS[d + 1]

                    if (nextRow < 0 || nextRow >= nRows || nextCol < 0 || nextCol >= nCols || mat[nextRow][nextCol] != RANGE_DATA)
                        continue

                    mat[nextRow][nextCol] = 1 + mat[row][col]
                    queue.addLast(Cell(nextRow, nextCol))
                }
            }
        }

        return mat
    }

    private data class Cell(val row: Int, val col: Int)
}