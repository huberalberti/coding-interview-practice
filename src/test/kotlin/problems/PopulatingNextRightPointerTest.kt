package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PopulatingNextRightPointerTest {
    val populatingNextRightPointer = PopulatingNextRightPointer()

    @Test
    internal fun `populates next pointers correctly`() {
        val node7 = Node(7)
        val node6 = Node(6)
        val node5 = Node(5)
        val node4 = Node(4)
        val node3 = Node(3, left = node6, right = node7)
        val node2 = Node(2, left = node4, right = node5)
        val node1 = Node(1, left = node2, right = node3)
        val expectedResult = "1#23#4567#"

        val result = populatingNextRightPointer(node1)

        assertEquals(expectedResult, result?.printAllNext())
    }
}