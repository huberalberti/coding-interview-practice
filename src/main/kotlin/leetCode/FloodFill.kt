package leetCode
//An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
//
//You are also given three integers sr, sc, and newColor. You should perform a flood fill on the image starting from
// the pixel image[sr][sc].
//
//To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting
// pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels
// (also with the same color), and so on. Replace the color of all of the aforementioned pixels with newColor.

//https://leetcode.com/problems/flood-fill/


class FloodFill {

    operator fun invoke(image: Array<IntArray>, sr: Int, sc: Int, newColor: Int): Array<IntArray> {
        val visited = Array(image.size) { Array<Boolean>(image[0].size) { false } }

        convert(image, sr, sc, newColor, image[sr][sc], visited)
        return image
    }

    private fun convert(
        image: Array<IntArray>,
        sr: Int,
        sc: Int,
        newColor: Int,
        oldColor: Int,
        visited: Array<Array<Boolean>>
    ) {
        if (sr < 0 || sc < 0 || sr >= image.size || sc >= image[0].size || image[sr][sc] != oldColor || visited[sr][sc]) return
        image[sr][sc] = newColor
        visited[sr][sc] = true

        convert(image, sr - 1, sc, newColor, oldColor, visited)
        convert(image, sr + 1, sc, newColor, oldColor, visited)
        convert(image, sr, sc - 1, newColor, oldColor, visited)
        convert(image, sr, sc + 1, newColor, oldColor, visited)
    }
}