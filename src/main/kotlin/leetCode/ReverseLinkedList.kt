package leetCode

import commons.ListNode

//Given the head of a singly linked list, reverse the list, and return the reversed list.
//https://leetcode.com/problems/reverse-linked-list/

class ReverseLinkedList {

    operator fun invoke(head: ListNode?): ListNode? {
        var current = head
        var previous:ListNode? = null

        while (current != null){
            var temp = current.next
            current.next = previous
            previous = current
            current = temp
        }


        return previous
    }
}