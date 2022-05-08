package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Matrix01Test {

    val matrix01 = Matrix01()

    @Test
    internal fun `return matrix with the distance to nearest 0 correctly`() {
        val input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))
        val expectedResult = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(0, 0, 0))

        val result = matrix01(input)

        assertArrayEquals(expectedResult, result)

    }

    @Test
    internal fun `return matrix with the distance to nearest 0 when cell is surrounded with non-zero`() {
        val input = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 1, 1))
        val expectedResult = arrayOf(intArrayOf(0, 0, 0), intArrayOf(0, 1, 0), intArrayOf(1, 2, 1))

        val result = matrix01(input)

        assertArrayEquals(expectedResult, result)

    }

    @Test
    internal fun `return matrix with the distance to nearest when value is in a corner`() {
        val input = arrayOf(intArrayOf(0,1,0,1,1), intArrayOf(1,1,0,0,1), intArrayOf(0,0,0,1,0), intArrayOf(1,0,1,1,1), intArrayOf(1,0,0,0,1))
        val expectedResult = arrayOf(intArrayOf(0,1,0,1,2), intArrayOf(1,1,0,0,1), intArrayOf(0,0,0,1,0), intArrayOf(1,0,1,1,1), intArrayOf(1,0,0,0,1))

        val result = matrix01(input)

        assertArrayEquals(expectedResult, result)

    }
}