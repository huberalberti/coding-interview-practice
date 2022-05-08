package problems

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ZigZagConversionTest {
    val zigZagConversion = ZigZagConversion()

    @Test
    internal fun `converts with 3 rows`() {
        val input = "PAYPALISHIRING"
        val rows = 3
        val expectedResult = "PAHNAPLSIIGYIR"

        val result = zigZagConversion(input, rows)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `converts with 4 rows`() {
        val input = "PAYPALISHIRING"
        val rows = 4
        val expectedResult = "PINALSIGYAHRPI"

        val result = zigZagConversion(input, rows)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `converts with equal number of rows and letters`() {
        val input = "Google"
        val rows = 6
        val expectedResult = "Google"

        val result = zigZagConversion(input, rows)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `converts with more rows than letters`() {
        val input = "Google"
        val rows = 10
        val expectedResult = "Google"

        val result = zigZagConversion(input, rows)

        assertEquals(expectedResult, result)
    }

    @Test
    internal fun `converts with only 1 row`() {
        val input = "Google"
        val rows = 1
        val expectedResult = "Google"

        val result = zigZagConversion(input, rows)

        assertEquals(expectedResult, result)
    }
}