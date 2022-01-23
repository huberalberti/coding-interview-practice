package leetCode.binarySearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class BinarySearchTest{

    val binarySearch = BinarySearch()

    @Test
    internal fun `search finds the correct index`() {

        //given
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 9

        //when
        val result = binarySearch.search(nums,target)

        //then
        assertEquals(4,result)
    }

    @Test
    internal fun `search returns -1 when target is not present`() {
        //given
        val nums = intArrayOf(-1,0,3,5,9,12)
        val target = 2

        //when
        val result = binarySearch.search(nums,target)

        //then
        assertEquals(-1,result)
    }
}
