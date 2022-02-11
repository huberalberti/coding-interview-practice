package leetCode

import commons.ListNode

//Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.

//Approach
// - Iterate the list and count the nodes. Divide the count by 2 and iterate again until reaching that number
// - 2 pointers. One moves +1 and the other +2. When the fast pointer reaches the end, the slow pointer is at half


class MiddleOfTheLinkedList {
    operator fun invoke(head: ListNode?): ListNode?{
        if(head == null) return null
        if(head.next == null) return head

        var slowPointer = head
        var fastPointer = head?.next?.next

        while (fastPointer?.next != null){
            fastPointer = fastPointer.next?.next
            slowPointer = slowPointer?.next
        }
        return slowPointer?.next
    }
}