package commons

class ListNode(var value: Int) {
    var next: ListNode? = null

    override fun toString(): String {
        var temp = next
        var result = value.toString()

        while (temp != null) {
            result.plus(temp.value)
            temp = temp.next
        }
        return result
    }
}