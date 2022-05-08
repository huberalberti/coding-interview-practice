package problems.binarySearch

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class FirstBadVersionTest {

    lateinit var firstBadVersion: FirstBadVersion

    @Test
    internal fun `isBadVersion returns true when version is bad`() {
        firstBadVersion = FirstBadVersion(3)
        val version = 5

        val result = firstBadVersion.isBadVersion(version)

        assertTrue(result)
    }

    @Test
    internal fun `isBadVersion return false when version is good`() {
        firstBadVersion = FirstBadVersion(3)
        val version = 1

        val result = firstBadVersion.isBadVersion(version)

        assertFalse(result)
    }

    @Test
    internal fun `isBadVersion return true when version is first bad version`() {
        firstBadVersion = FirstBadVersion(3)
        val version = 3

        val result = firstBadVersion.isBadVersion(version)

        assertTrue(result)
    }

    @Test
    internal fun `firstBadVersion return the first version that is bad`() {
        val expectedResult = 4
        firstBadVersion = FirstBadVersion(expectedResult)

        val result = firstBadVersion.firstBadVersion(5)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `firstBadVersion return 1 when there is only 1 element`() {
        val expectedResult = 1
        firstBadVersion = FirstBadVersion(expectedResult)

        val result = firstBadVersion.firstBadVersion(1)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `firstBadVersion returns 1 when the first version is bad`() {
        val expectedResult = 1
        firstBadVersion = FirstBadVersion(expectedResult)

        val result = firstBadVersion.firstBadVersion(3)

        assertEquals(expectedResult, result)
    }
}