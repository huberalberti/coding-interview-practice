package leetCode

//Given a string s, reverse the order of characters in each word within a sentence while still
// preserving whitespace and initial word order.
// https://leetcode.com/problems/reverse-words-in-a-string-iii/

// Approaches
// - Split the input string into words. Iterate the array of words and reverse in place each word
class ReverseWordsInStringIII {
    operator fun invoke(s: String): String {
        val words = s.split(" ").toMutableList()

        for (i in words.indices) {
            words[i] = reverse(words[i])
        }
        return words.joinToString(" ")
    }

    private fun reverse(word: String): String {
        return word.reversed()
    }
}