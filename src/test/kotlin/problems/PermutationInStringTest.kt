package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PermutationInStringTest{
    val permutationInString = PermutationInString()

    @Test
    internal fun `returns true when s2 contains permutation of s1`() {
        val s1 = "ab"
        val s2 = "eidbaooo"

        val result = permutationInString(s1, s2)

        assertTrue(result)
    }

    @Test
    internal fun `returns false when s2 doesn't contain a permutation of s1`() {
        val s1 = "ab"
        val s2 = "eidboaoo"

        val result = permutationInString(s1, s2)

        assertFalse(result)
    }

    @Test
    internal fun `returns true when s1 only contains 1 character and s2 also contains it`() {
        val s1 = "a"
        val s2 = "ab"

        val result = permutationInString(s1, s2)

        assertTrue(result)
    }

    @Test
    internal fun `returns false when s2 is shorter than s1`() {
        val s1 = "abc"
        val s2 = "a"

        val result = permutationInString(s1, s2)

        assertFalse(result)
    }
}