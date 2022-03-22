package leetCode

//Given a string s, remove duplicate letters so that every letter appears once and only once.
// You must make sure your result is the smallest in lexicographical order among all possible results.
//
//https://leetcode.com/problems/remove-duplicate-letters/

class RemoveDuplicateLetters {
    operator fun invoke(s: String): String {
        val indexMap = mutableMapOf<Char, Int>()
        var result = ""
        var lastLetter = 'z'

        for (i in s.length -1 downTo 0){
            if(!indexMap.containsKey(s[i]) || s[i] <= lastLetter){
                indexMap[s[i]] = i
                lastLetter = s[i]
            }
        }

        indexMap.toList().sortedBy { it.second }.map { result += it.first }
        return result
    }
}