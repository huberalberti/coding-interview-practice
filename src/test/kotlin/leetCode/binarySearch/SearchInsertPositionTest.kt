package leetCode.binarySearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SearchInsertPositionTest {

    val searchInsertPosition = SearchInsertPosition()

    @Test
    internal fun `search return index when target exists`() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 5
        val expectedResult = 2

        val result = searchInsertPosition.searchInsert(nums, target)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `search return index when target does not exist`() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 2
        val expectedResult = 1

        val result = searchInsertPosition.searchInsert(nums, target)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `search return index when target should be at the end`() {
        val nums = intArrayOf(1, 3, 5, 6)
        val target = 7
        val expectedResult = 4

        val result = searchInsertPosition.searchInsert(nums, target)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `search return 0 when target should be at the start`() {
        val nums = intArrayOf(2, 3, 5, 6)
        val target = 1
        val expectedResult = 0

        val result = searchInsertPosition.searchInsert(nums, target)

        assertEquals(expectedResult, result)
    }

}