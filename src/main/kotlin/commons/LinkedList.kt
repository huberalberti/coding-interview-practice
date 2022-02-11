package commons

class LinkedList(var head: ListNode?) {
    var tail = head

    fun add(node: ListNode) {
        if (head == null) {
            head = node
            tail = node
        } else {
            tail?.next = node
            tail = node
        }
    }
}
