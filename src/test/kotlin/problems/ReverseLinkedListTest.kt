package problems

import commons.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ReverseLinkedListTest {
    val reverseLinkedList = ReverseLinkedList()

    @Test
    internal fun `return reversed list`() {
        val input = ListNode.fromList(listOf(1, 2, 3, 4, 5))
        val expectedResult = "54321"

        val result = reverseLinkedList(input)

        assertEquals(expectedResult, result.toString())
    }
}