package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DuplicateNumberTest {

    val duplicateNumber = DuplicateNumber()

    @Test
    internal fun `finds duplicate number when they are next to each other`() {
        val input = intArrayOf(1, 3, 4, 2, 2)
        val expectedResult = 2

        val result = duplicateNumber(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `finds duplicate number`() {
        val input = intArrayOf(3,1,3,4,2)
        val expectedResult = 3

        val result = duplicateNumber(input)

        assertEquals(expectedResult, result)
    }
}