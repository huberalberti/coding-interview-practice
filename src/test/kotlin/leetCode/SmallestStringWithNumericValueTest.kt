package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SmallestStringWithNumericValueTest{

    val smallestStringWithNumericValue = SmallestStringWithNumericValue()

    @Test
    internal fun `return smallest string`() {
        val n = 3
        val k = 27
        val expectedResult = "aay"

        val result = smallestStringWithNumericValue(n, k)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return smallest string when there are multiple solutions`() {
        val n = 5
        val k = 73
        val expectedResult = "aaszz"

        val result = smallestStringWithNumericValue(n, k)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return error when there is no possible combination`() {
        val n = 2
        val k = 100
        val expectedResult = "error"

        val result = smallestStringWithNumericValue(n, k)

        assertEquals(expectedResult, result)
    }
}