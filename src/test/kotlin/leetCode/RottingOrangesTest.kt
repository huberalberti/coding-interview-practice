package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RottingOrangesTest {

    val rottingOranges = RottingOranges();

    @Test
    internal fun `return the number of minutes until there are no fresh oranges correctly`() {
        val input = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1)
        )
        val expectedResult = 4

        val result = rottingOranges(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return -1 when there is a fresh apple that cannot be rotten`() {
        val input = arrayOf(
            intArrayOf(2, 1, 1),
            intArrayOf(0, 1, 1),
            intArrayOf(1, 0, 1)
        )
        val expectedResult = -1

        val result = rottingOranges(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return 0 when grid is only has one empty element`() {
        val input = arrayOf(
            intArrayOf(0)
        )
        val expectedResult = 0

        val result = rottingOranges(input)

        assertEquals(expectedResult, result)
    }
}