package leetCode
//Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could
//represent. Return the answer in any order.
//
//A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any
// letters.

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

class LetterCombinationsPhone {
    operator fun invoke(digits: String): List<String> {
        if (digits == "") return listOf()

        val charMap = mapOf(
            '1' to listOf(),
            '2' to listOf('a', 'b', 'c'),
            '3' to listOf('d', 'e', 'f'),
            '4' to listOf('g', 'h', 'i'),
            '5' to listOf('j', 'k', 'l'),
            '6' to listOf('m', 'n', 'o'),
            '7' to listOf('p', 'q', 'r', 's'),
            '8' to listOf('t', 'u', 'v'),
            '9' to listOf('w', 'x', 'y', 'z'),
            '0' to listOf(' ')
        )

        val combinationsQueue = mutableListOf<String>()

        digits.forEachIndexed { i, digit ->
            val letters = charMap.getOrDefault(digit, listOf())
            if (combinationsQueue.isEmpty()) {
                letters.forEach { combinationsQueue.add(it.toString()) }
            } else {
                var combination = ""
                while (combinationsQueue.first().length <= i) {
                    combination = combinationsQueue.removeAt(0)
                    letters.forEach { combinationsQueue.add(combination + it.toString()) }
                }
            }
        }
        return combinationsQueue
    }
}