package problems

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
// (you may want to display this pattern in a fixed font for better legibility)
//https://leetcode.com/problems/zigzag-conversion/

class ZigZagConversion {

    operator fun invoke(s: String, numRows: Int): String {
        if(numRows == 1) return s

        val rows = Array(numRows) { "" }
        var rowIndex = 0
        var orientation = 1

        for (letter in s) {
            rows[rowIndex] = rows[rowIndex] + letter
            rowIndex += orientation

            if(rowIndex == numRows - 1 || rowIndex == 0){
                orientation *= -1
            }
        }

        return rows.joinToString("")
    }
}