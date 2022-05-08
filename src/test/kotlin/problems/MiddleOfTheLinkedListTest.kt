package problems

import commons.LinkedList
import commons.ListNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MiddleOfTheLinkedListTest {

    val middleOfTheLinkedList = MiddleOfTheLinkedList()

    @Test
    internal fun `return middle node when list has only 1 middle element`() {
        val input = createList(intArrayOf(1, 2, 3, 4, 5))
        val expectedResult = ListNode(3)
        expectedResult.next = ListNode(4)

        val result = middleOfTheLinkedList(input)

        assertEquals(expectedResult.value, result?.value)
    }

    @Test
    internal fun `return second middle node when list has 2 middle element`() {
        val input = createList(intArrayOf(1, 2, 3, 4))
        val expectedResult = ListNode(3)
        expectedResult.next = ListNode(4)

        val result = middleOfTheLinkedList(input)

        assertEquals(expectedResult.value, result?.value)
    }

    @Test
    internal fun `return  node when list has only 1 element`() {
        val input = createList(intArrayOf(1))
        val expectedResult = ListNode(1)

        val result = middleOfTheLinkedList(input)

        assertEquals(expectedResult.value, result?.value)
    }

    private fun createList(nums: IntArray): ListNode? {
        val list = LinkedList(null)
        for (number in nums) {
            list.add(ListNode(number))
        }
        return list.head
    }
}