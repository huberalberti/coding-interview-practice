package leetCode


// Given a string s, find the length of the longest substring without repeating characters.

class LongestSubstringWithoutRepeatingCharacter {
    operator fun invoke(s: String): Int {
        var left = 0
        var right = 0
        val subString = mutableSetOf<Char>()
        var maxLength = 0

        while (right < s.length){
            if (!subString.contains(s[right])){
                subString.add(s[right])
                right ++
            }
            else{
                subString.remove(s[left])
                left ++
            }
            maxLength = maxOf(maxLength, subString.size)
        }
        return maxLength
    }
}