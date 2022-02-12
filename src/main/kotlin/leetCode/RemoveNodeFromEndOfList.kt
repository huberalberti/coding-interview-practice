package leetCode

import commons.ListNode

//Given the head of a linked list, remove the nth node from the end of the list and return its head.


class RemoveNodeFromEndOfList {
    operator fun invoke(head: ListNode?, index: Int): ListNode? {
        var start: ListNode? = ListNode(0)
        start?.next = head
        var leftNode = start
        var rightNode = start

        for (i in 1..index) {
            rightNode = rightNode?.next
        }

        while (rightNode?.next != null) {
            rightNode = rightNode.next
            leftNode = leftNode?.next
        }
        leftNode?.next = leftNode?.next?.next

        return start?.next
    }
}