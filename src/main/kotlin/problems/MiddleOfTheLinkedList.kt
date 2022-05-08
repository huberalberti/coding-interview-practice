package problems

import commons.ListNode

//Given the head of a singly linked list, return the middle node of the linked list.
//
//If there are two middle nodes, return the second middle node.

//Approach
// - Iterate the list and count the nodes. Divide the count by 2 and iterate again until reaching that number
// - 2 pointers. One moves +1 and the other +2. When the fast pointer reaches the end, the slow pointer is at half


class MiddleOfTheLinkedList {
    operator fun invoke(head: ListNode?): ListNode?{
        var slowPointer = head
        var fastPointer = head

        while (fastPointer != null && fastPointer.next != null){
            slowPointer = slowPointer?.next
            fastPointer = fastPointer.next?.next
        }
        return slowPointer
    }
}