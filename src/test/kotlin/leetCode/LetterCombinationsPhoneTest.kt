package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class LetterCombinationsPhoneTest {

    val letterCombinationsPhone = LetterCombinationsPhone()

    @Test
    internal fun `return all combinations of letters`() {
        val input = "23"
        val expectedOutput = listOf<String>("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")
        val result = letterCombinationsPhone(input)

        assertEquals(expectedOutput.sorted(), result.sorted())
    }

    @Test
    internal fun `return empty list when input is empty`() {
        val input = ""
        val expectedOutput = listOf<String>()
        val result = letterCombinationsPhone(input)
        assertEquals(expectedOutput.sorted(), result.sorted())
    }
}