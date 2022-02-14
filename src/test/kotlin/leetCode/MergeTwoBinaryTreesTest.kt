package leetCode

import commons.TreeNode
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MergeTwoBinaryTreesTest {
    val mergeTwoBinaryTrees = MergeTwoBinaryTrees()

    @Test
    internal fun `return correctly merged tree`() {
        val root1 = TreeNode(1)
        val node2 = TreeNode(3)
        val node3 = TreeNode(2)
        val node4 = TreeNode(5)
        root1.left = node2
        root1.right = node3
        node2.left = node4

        val root2 = TreeNode(2)
        val node5 = TreeNode(1)
        val node6 = TreeNode(3)
        val node7 = TreeNode(4)
        val node8 = TreeNode(7)

        root2.left = node5
        root2.right = node6
        node5.right = node7
        node6.right = node8

        val expectedResult = "34554NULL7"


        val result = mergeTwoBinaryTrees(root1, root2)

        assertEquals(expectedResult, result?.toString())
    }
}