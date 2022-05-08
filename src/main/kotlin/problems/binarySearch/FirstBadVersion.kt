package problems.binarySearch

//You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of
// your product fails the quality check. Since each version is developed based on the previous version, all the versions
// after a bad version are also bad.
//
//Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the
// following ones to be bad.
//
//You are given an API bool isBadVersion(version) which returns whether version is bad.
// Implement a function to find the first bad version. You should minimize the number of calls to the API.

//https://leetcode.com/problems/first-bad-version/

class FirstBadVersion(private val badVersion: Int) {

    fun isBadVersion(version: Int): Boolean {
        return version >= badVersion
    }

    fun firstBadVersion(n: Int): Int {
        // 1, 2, 3, 4B, 5B
        var left = 1
        var right = n
        var pivot: Int

        while (left <= right){
            pivot = left + (right - left) / 2
            if (isBadVersion(pivot)){
                right = pivot - 1
            }
            else{
                left = pivot + 1
            }
        }

        return left
    }

}