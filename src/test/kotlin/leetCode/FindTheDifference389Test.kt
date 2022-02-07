package leetCode

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FindTheDifference389Test {

    val findTheDifference = FindTheDifference389()

    @Test
    internal fun `Find the difference returns the extra letter correctly`() {
        val inputS = "abcd"
        val inputT = "abcde"
        val expectedResult = 'e'
        val result = findTheDifference.find(inputS, inputT)

        assertEquals(expectedResult,result)
    }

    @Test
    internal fun `Find the difference returns the extra letter when inputS is empty`() {
        val inputS = ""
        val inputT = "a"
        val expectedResult = 'a'
        val result = findTheDifference.find(inputS, inputT)

        assertEquals(expectedResult,result)
    }

    @Test
    internal fun `Find the difference returns the extra letter when there are repeating letters`() {
        val inputS = "aab"
        val inputT = "baea"
        val expectedResult = 'e'
        val result = findTheDifference.find(inputS, inputT)

        assertEquals(expectedResult,result)
    }
}