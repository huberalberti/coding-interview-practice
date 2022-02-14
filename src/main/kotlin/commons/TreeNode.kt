package commons

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null


    override fun toString(): String {
        val tree = toList()
        var result = ""
        for (node in tree) {
            if (node?.value == null) {
                result = result.plus("NULL")
            } else {
               result = result.plus(node.value)
            }
        }
        return result
    }

    private fun toList(): List<TreeNode?> {
        val result = mutableListOf<TreeNode?>()
        val stack = mutableListOf<TreeNode?>()
        stack.add(this)

        while (stack.isNotEmpty()) {
            var node = stack.removeAt(0)
            result.add(node)
            if (node?.left != null || node?.right != null) {
                stack.add(node.left)
                stack.add(node.right)
            }
        }

        return result
    }
}

