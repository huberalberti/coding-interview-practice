package leetCode

//You are given a perfect binary tree where all leaves are on the same level, and every parent has two children.
// The binary tree has the following definition:
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
//Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.
//
//Initially, all next pointers are set to NULL.

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

class PopulatingNextRightPointer {

    operator fun invoke(root: Node?): Node? {
        if (root == null) return null
        val stack = mutableListOf<Node>()
        stack.add(root)

        while (stack.isNotEmpty()) {
            var currentNode = stack.removeAt(0)
            if (currentNode.left != null && currentNode.right != null) {
                currentNode.left?.next = currentNode.right
                if (currentNode.next != null) {
                    currentNode.right?.next = currentNode.next?.left
                }
                stack.add(currentNode.left!!)
                stack.add(currentNode.right!!)
            }
        }
        return root
    }

}

data class Node(
    var value: Int?,
    var left: Node? = null,
    var right: Node? = null,
    var next: Node? = null
) {

    fun printAllNext(): String {
        var result = ""
        val stack = mutableListOf<Node>()
        stack.add(this)
        while (stack.isNotEmpty()) {
            var node = stack.removeAt(0)
            result = result.plus(node.value)
            if (node.next == null) {
                result = result.plus("#")
            }
            if (node.left != null) {
                stack.add(node.left!!)
                stack.add(node.right!!)
            }
        }
        return result
    }
}