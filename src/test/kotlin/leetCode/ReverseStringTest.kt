package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseStringTest{

    private val reverseString = ReverseString()

    @Test
    internal fun `Reverse returns the input array correctly reversed`() {
        val input = charArrayOf('h','e','l','l','o')
        val expectedResult = charArrayOf('o','l','l','e','h')

        reverseString(input)

        assertArrayEquals(expectedResult,input)
    }

    @Test
    internal fun `Reverse returns empty array when input is empty`() {
        val input = charArrayOf()
        val expectedResult = charArrayOf()

        reverseString(input)

        assertArrayEquals(expectedResult,input)
    }
}