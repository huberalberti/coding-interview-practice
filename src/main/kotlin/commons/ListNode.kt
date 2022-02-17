package commons


class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var temp = next
        var result = value.toString()

        while (temp != null) {
            result = result.plus(temp.value)
            temp = temp.next
        }
        return result
    }

    companion object {
        fun fromList(list: List<Int>): ListNode? {
            var head = ListNode(0)
            var last = head
            for (element in list) {
                last.next = ListNode(element)
                last = last.next!!
            }
            return head.next
        }
    }
}