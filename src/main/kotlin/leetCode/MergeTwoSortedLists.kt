package leetCode

import commons.ListNode

//You are given the heads of two sorted linked lists list1 and list2.
//
//Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//Return the head of the merged linked list.

//https://leetcode.com/problems/merge-two-sorted-lists/


class MergeTwoSortedLists {

    operator fun invoke(list1: ListNode?, list2: ListNode?): ListNode? {
        var head = ListNode(0)
        var node1 = list1
        var node2 = list2
        var merged = head

        while (node1 != null && node2 != null) {
            if (node1.value <= node2.value) {
                merged.next = node1
                node1 = node1.next
            } else {
                merged.next = node2
                node2 = node2.next
            }
            merged = merged.next!!
        }

        if (node1 != null) {
            merged.next = node1
        } else if (node2 != null) {
            merged.next = node2
        }
        return head.next
    }
}