package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseWordsInStringIIITest {

    private val reverseWordsInString = ReverseWordsInStringIII()

    @Test
    internal fun `Reverse words correctly returns each word reversed`() {
        val input = "Let's take LeetCode contest"
        val expectedResult = "s'teL ekat edoCteeL tsetnoc"

        val result = reverseWordsInString(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `Reverse the workd when there is only 1 word`() {
        val input = "LeetCode"
        val expectedResult = "edoCteeL"

        val result = reverseWordsInString(input)

        assertEquals(expectedResult, result)
    }
}