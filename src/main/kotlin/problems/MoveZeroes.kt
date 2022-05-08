package problems

//Given an integer array nums, move all 0's to the end of it while maintaining the
// relative order of the non-zero elements.
//
//Note that you must do this in-place without making a copy of the array.

// Approaches
// - Bubble. Iterate the array. If value is 0 then bubble it to the end. O(N^2)
// - Secondary array. Iterate the array. If value is not zero add it to the end of a separate array.
// Once finish complete the secondary array with all 0 at the end. O(n) space O(n)
// - 2 pointers. Iterate the array and keep track of the index of the las non-zero value. When you find a non-zero
// value move it to the nextNonZero index and increase that index +1

class MoveZeroes {
    operator fun invoke(nums: IntArray) {
        var nextNonZero = 0
        for (i in nums.indices){
            if(nums[i] != 0){
                swap(nums, i, nextNonZero)
                nextNonZero ++
            }
        }
    }

    private fun swap(nums: IntArray, currentIndex : Int, newIndex : Int){
        val temp = nums[newIndex]
        nums[newIndex] = nums[currentIndex]
        nums[currentIndex] = temp
    }
}