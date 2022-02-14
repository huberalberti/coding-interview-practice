package leetCode

import commons.TreeNode

// You are given two binary trees root1 and root2.
//
//Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others
// are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then
// sum node values up as the new value of the merged node. Otherwise,
// the NOT null node will be used as the node of the new tree.
//
//Return the merged tree.
//
//Note: The merging process must start from the root nodes of both trees.
// https://leetcode.com/problems/merge-two-binary-trees/

class MergeTwoBinaryTrees {
    operator fun invoke(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        return merge(root1, root2)
    }

    private fun merge(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        if (root1 == null && root2 == null) return null

        var value = 0
        if (root1 != null) value += root1.value
        if (root2 != null) value += root2.value

        val root = TreeNode(value)

        if (root1?.left != null || root1?.right != null || root2?.left != null || root2?.right != null) {
            root.left = merge(root1?.left, root2?.left)
            root.right = merge(root1?.right, root2?.right)
        }
        return root
    }
}