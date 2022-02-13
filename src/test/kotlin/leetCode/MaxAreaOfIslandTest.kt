package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MaxAreaOfIslandTest{
    val maxAreaOfIsland = MaxAreaOfIsland()

    @Test
    internal fun `return area of the biggest island`() {
        val input = arrayOf(
            intArrayOf(0,0,1,0,0,0,0,1,0,0,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
            intArrayOf(0,1,1,0,1,0,0,0,0,0,0,0,0),
            intArrayOf(0,1,0,0,1,1,0,0,1,0,1,0,0),
            intArrayOf(0,1,0,0,1,1,0,0,1,1,1,0,0),
            intArrayOf(0,0,0,0,0,0,0,0,0,0,1,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,1,1,0,0,0,0)
        )
        val expectedResult = 6

        val result = maxAreaOfIsland(input)

        assertEquals(expectedResult,result)
    }

    @Test
    internal fun `return 0 when there are no islands`() {
        val input = arrayOf(
            intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0),
            intArrayOf(0,0,0,0,0,0,0,0,0,0,0,0,0),
        )
        val expectedResult = 0

        val result = maxAreaOfIsland(input)

        assertEquals(expectedResult,result)
    }
}