package leetCode

// Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
//
//In other words, return true if one of s1's permutations is the substring of s2.

// Approach
// - Calculate all permutations and then find them in s2. I don't know how to calculate all permutations
// - Sliding window. Create a map with the characters of s1. Define a window of length = s1.length
// Iterate over s2 with the window. Remove the characters from the windows. If any char in map is not 0 then
// move the window until all characters in map are 0

class PermutationInString {

    operator fun invoke(s1: String, s2: String): Boolean {
        if (s1.length > s2.length){
            return false
        }
        val freq = IntArray(26) { 0 }
        var left = 0
        var right = s1.length - 1

        for (i in s1.indices) {
            freq[s1[i] - 'a']++
            freq[s2[i] - 'a']--
        }

        while (right < s2.length - 1) {
            if (freq.all { it == 0 }) {
                return true
            } else {
                right++
                freq[s2[right] - 'a']--
                freq[s2[left] - 'a']++
                left++
            }
        }
        return freq.all { it == 0 }
    }
}