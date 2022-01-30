package leetCode.binarySearch
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
//
//You must write an algorithm with O(log n) runtime complexity.

class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var pivot = 0

        while (left <= right) {
            pivot = left + (right - left) / 2
            if (nums[pivot] == target) {
                return pivot
            } else if (nums[pivot] < target) {
                left = pivot + 1
            } else {
                right = pivot - 1
            }
        }
        return left
    }
}