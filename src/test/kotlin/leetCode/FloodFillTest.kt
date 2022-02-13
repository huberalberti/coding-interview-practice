package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FloodFillTest {
    val floodFill = FloodFill()

    @Test
    internal fun `flood fill successfully returns a new image with the new color`() {
        val input = arrayOf<IntArray>(intArrayOf(1, 1, 1), intArrayOf(1, 1, 0), intArrayOf(1, 0, 1))
        val sr = 1
        val sc = 1
        val newColor = 2
        val expectedResult = arrayOf<IntArray>(intArrayOf(2, 2, 2), intArrayOf(2, 2, 0), intArrayOf(2, 0, 1))

        val result = floodFill(input, sr, sc, newColor)

        assertArrayEquals(expectedResult, result)
    }

    @Test
    internal fun `flood changes all pixels when input is all the same`() {
        val input = arrayOf<IntArray>(intArrayOf(1, 1, 1), intArrayOf(1, 1, 1), intArrayOf(1, 1, 1))
        val sr = 1
        val sc = 1
        val newColor = 0
        val expectedResult = arrayOf<IntArray>(intArrayOf(0, 0, 0), intArrayOf(0, 0, 0), intArrayOf(0, 0, 0))

        val result = floodFill(input, sr, sc, newColor)

        assertArrayEquals(expectedResult, result)
    }
}