package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SquareOfSortedArrayTest{

    val squareOfSortedArray = SquareOfSortedArray()

    @Test
    internal fun `Square array returns a sorted array with the squares`() {
        //given
        val input = intArrayOf(-4,-1,0,3,10)
        val expectedResult = intArrayOf(0,1,9,16,100)
        //when
        val result = squareOfSortedArray(input)
        //then
        assertArrayEquals(expectedResult,result)
    }

    @Test
    internal fun `Square array returns a sorted when there are complement values`() {
        //given
        val input = intArrayOf(-7,-3,2,3,11)
        val expectedResult = intArrayOf(4,9,9,49,121)
        //when
        val result = squareOfSortedArray(input)
        //then
        assertArrayEquals(expectedResult,result)
    }
}