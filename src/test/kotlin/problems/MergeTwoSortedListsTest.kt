package problems

import commons.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MergeTwoSortedListsTest {
    val mergeTwoSortedLists = MergeTwoSortedLists()

    @Test
    internal fun `return correctly merged list`() {
        val input1 = ListNode.fromList(listOf(1, 2, 4))
        val input2 = ListNode.fromList(listOf(1, 3, 4))
        val expectedResult = "112344"


        val result = mergeTwoSortedLists(input1, input2)

        assertEquals(expectedResult, result?.toString())

    }

    @Test
    internal fun `return correctly merged list one one input is null`() {
        val input1 = null
        val input2 = ListNode.fromList(listOf(1, 3, 4))
        val expectedResult = "134"


        val result = mergeTwoSortedLists(input1, input2)

        assertEquals(expectedResult, result?.toString())

    }
}