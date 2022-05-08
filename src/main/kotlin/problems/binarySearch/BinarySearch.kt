package problems.binarySearch
// Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search
// target in nums. If target exists, then return its index. Otherwise, return -1.
// You must write an algorithm with O(log n) runtime complexity.
// https://leetcode.com/problems/binary-search/

class BinarySearch {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1

        while (left <= right){
            val index = left + (right - left) / 2
            if(nums[index] == target){
                return index
            }
            else if (nums[index] < target){
                left = index + 1
            }
            else {
                right = index - 1
            }
        }
        return -1
    }

}