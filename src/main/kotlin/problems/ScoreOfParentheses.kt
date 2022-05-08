package problems
//Given a balanced parentheses string s, return the score of the string.
//
//The score of a balanced parentheses string is based on the following rule:
//
//"()" has score 1.
//AB has score A + B, where A and B are balanced parentheses strings.
//(A) has score 2 * A, where A is a balanced parentheses string.

//https://leetcode.com/problems/score-of-parentheses/

const val OPEN = '('

class ScoreOfParentheses {

    operator fun invoke(s: String): Int {
        return helper(s)
    }

    private fun helper(input: String): Int {
        var result = 0
        var parenthesesCount = 0
        var subStringStartIndex = 0

        for (i in input.indices) {
            if (input[i] == OPEN) parenthesesCount++
            else parenthesesCount--

            if (parenthesesCount == 0) {
                val substring = input.substring(subStringStartIndex + 1, i )
                if(substring.isEmpty()){
                    result ++
                }
                else{
                    result += 2 * helper(substring)
                }
                subStringStartIndex = i + 1
            }
        }
        return result
    }
}