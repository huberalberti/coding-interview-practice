package leetCode

import commons.LinkedList
import commons.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class RemoveNodeFromEndOfListTest {
    val removeNodeFromEndOfList = RemoveNodeFromEndOfList()

    @Test
    internal fun `remove node returns the list without the node at the input position`() {
        val input = createList(intArrayOf(1, 2, 3, 4, 5))
        val index = 2
        val expectedResult = createList(intArrayOf(1, 2, 3, 5))

        val result = removeNodeFromEndOfList(input, index)

        assertEquals(expectedResult?.toString(), result?.toString())
    }

    @Test
    internal fun `remove node returns empty list when there is only one number`() {
        val input = createList(intArrayOf(1))
        val index = 1
        val expectedResult = null

        val result = removeNodeFromEndOfList(input, index)

        assertEquals(expectedResult?.toString(), result?.toString())
    }

    private fun createList(input: IntArray): ListNode? {
        var head: ListNode? = null
        var temp: ListNode? = null

        for (num in input) {
            if (head == null) {
                head = ListNode(num)
                temp = head
            } else {
                temp?.next = ListNode(num)
                temp = temp?.next
            }
        }
        return head
    }
}