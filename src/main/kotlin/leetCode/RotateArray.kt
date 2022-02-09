package leetCode

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//
// Approaches
// - Create a rotate right method that moves every element 1 step to the right. Call that method K times O(nk)
// - Iterate over nums, for each number calculate new index and insert a new array at [newIndex] O(n). Space O(n)
// - Roate in place O(n) space O(1) - I don't know how

class RotateArray {
    operator fun invoke(nums: IntArray, k: Int): Unit {
        val result = IntArray(nums.size)

        for (i in nums.indices) {
            result[calculateNextIndex(nums.size, i, k)] = nums[i]
        }

        for (i in nums.indices){
            nums[i] = result[i]
        }
    }

    fun calculateNextIndex(maxIndex: Int, currentIndex: Int, k: Int): Int {
        var nextIndex = currentIndex + k
        while (nextIndex >= maxIndex) {
            nextIndex -= maxIndex
        }
        return nextIndex
    }
}