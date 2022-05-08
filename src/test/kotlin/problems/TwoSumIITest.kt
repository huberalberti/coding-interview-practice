package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TwoSumIITest {

    val twoSumII = TwoSumII()

    @Test
    internal fun `finds the two sum when input is all positive`() {
        val input = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expectedResult = intArrayOf(1, 2)

        val result = twoSumII(input, target)

        assertArrayEquals(expectedResult, result)
    }

    @Test
    internal fun `finds the two sum when input has negative numbers`() {
        val input = intArrayOf(-5, -2, 1, 7, 14, 15)
        val target = 12
        val expectedResult = intArrayOf(2, 5)

        val result = twoSumII(input, target)

        assertArrayEquals(expectedResult, result)
    }

    @Test
    internal fun `finds the two sum when target is negative`() {
        val input = intArrayOf(-10, -7, 4, 10, 15)
        val target = -3
        val expectedResult = intArrayOf(2, 3)

        val result = twoSumII(input, target)

        assertArrayEquals(expectedResult, result)
    }
}