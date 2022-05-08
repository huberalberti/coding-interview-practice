package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LongestSubstringWithoutRepeatingCharacterTest {
    val longestSubstring = LongestSubstringWithoutRepeatingCharacter()

    @Test
    internal fun `return longest substring without repeating characters`() {
        val input = "abcabcbb"
        val expectedResult = 3

        val result = longestSubstring(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return 1 when all characters in input are the same`() {
        val input = "bbbb"
        val expectedResult = 1

        val result = longestSubstring(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `return longest substring when input has consecutive repeated characters`() {
        val input = "pwwkew"
        val expectedResult = 3

        val result = longestSubstring(input)

        assertEquals(expectedResult, result)
    }
}