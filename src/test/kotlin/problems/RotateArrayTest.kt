package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RotateArrayTest {

    val rotateArray = RotateArray()

    @Test
    internal fun `Rotate moves every element k places to the left correctly`() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val expectedResult = intArrayOf(5, 6, 7, 1, 2, 3, 4)

        rotateArray(input, k)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `Rotate moves every element k places to the left correctly with negative input`() {
        val input = intArrayOf(-1, -100, 3, 99)
        val k = 2
        val expectedResult = intArrayOf(3, 99, -1, -100)

        rotateArray(input, k)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `When input is a single number returns the same number`() {
        val input = intArrayOf(-1)
        val k = 2
        val expectedResult = intArrayOf(-1)

        rotateArray(input, k)

        assertArrayEquals(expectedResult, input)
    }
}