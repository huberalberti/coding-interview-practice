package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RemoveDuplicateLettersTest {
    val removeDuplicateLetters = RemoveDuplicateLetters()

    @Test
    internal fun `removes duplicate letters from input`() {
        val input = "abcccb"
        val expectedResult = "abc"

        val result = removeDuplicateLetters(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return the smallest in lexicographical order`() {
        val input = "cbacdcbc"
        val expectedResult = "acdb"

        val result = removeDuplicateLetters(input)

        assertEquals(expectedResult, result)
    }
}