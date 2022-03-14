package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SimplifyPathTest {
    val simplifyPath = SimplifyPath()

    @Test
    internal fun `returns canonical path of directory`() {
        val input = "/home/"
        val expectedResult = "/home"

        val result = simplifyPath(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `returns canonical path when there is a double slash`() {
        val input = "/home//foo/"
        val expectedResult = "/home/foo"

        val result = simplifyPath(input)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `returns root when there are double periods`() {
        val input = "/../"
        val expectedResult = "/"

        val result = simplifyPath(input)

        assertEquals(expectedResult, result)
    }
}