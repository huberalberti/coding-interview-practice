package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MoveZeroesTest {
    val moveZeroes = MoveZeroes()

    @Test
    internal fun `moveZeroes shifts all the zeroes to the end of the array correctly`() {
        val input = intArrayOf(0, 1, 0, 3, 12)
        val expectedResult = intArrayOf(1, 3, 12, 0, 0)

        moveZeroes(input)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `moveZeroes returns zero when input is only zero`() {
        val input = intArrayOf(0)
        val expectedResult = intArrayOf(0)

        moveZeroes(input)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `moveZeroes shifts all zeroes to the end when input has multiple consecutive numbers`() {
        val input = intArrayOf(1,2,3,0,0,0,4,5,0,6)
        val expectedResult = intArrayOf(1,2,3,4,5,6,0,0,0,0)

        moveZeroes(input)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `moveZeroes shifts return all zeroes when input is all zeros`() {
        val input = intArrayOf(0,0,0,4)
        val expectedResult = intArrayOf(0,0,0,0)

        moveZeroes(input)

        assertArrayEquals(expectedResult, input)
    }

    @Test
    internal fun `moveZeroes shifts return same value when there are no zeroes`() {
        val input = intArrayOf(1,2,3,4)
        val expectedResult = intArrayOf(1,2,3,4)

        moveZeroes(input)

        assertArrayEquals(expectedResult, input)
    }
}