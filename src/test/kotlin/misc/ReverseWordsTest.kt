package misc

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseWordsTest {
    val reverseWords = ReverseWords()

    @Test
    internal fun `Correctly reverse words text`() {
        val input = "This is the first test"
        val result = reverseWords(input)
        val expected = "sihT si eht tsrif tset"
        assertEquals(expected, result)
    }
}

