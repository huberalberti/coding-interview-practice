package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ScoreOfParenthesesTest {
    val scoreOfParentheses = ScoreOfParentheses()

    @Test
    internal fun `returns 1 when input only has one pair or parentheses`() {
        val input = "()"
        val expectedResult = 1
        val result = scoreOfParentheses(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `returns 2 when input has 2 pairs of parentheses nex to each other`() {
        val input = "()()"
        val expectedResult = 2
        val result = scoreOfParentheses(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `returns 2 when input has 2 nested pairs of parentheses`() {
        val input = "(())"
        val expectedResult = 2
        val result = scoreOfParentheses(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `returns score when input a combination of nested and sequential parentheses`() {
        val input = "(()())"
        val expectedResult = 4
        val result = scoreOfParentheses(input)

        assertEquals(expectedResult, result)
    }
}