package problems
//Given an integer array nums sorted in non-decreasing order, return an array of the squares
// of each number sorted in non-decreasing order.


// - Iterate over nums, generate squares and then sort. O(nlogn)
// - Iterate over nums, generate squares and add into sorted array O(nlogn)
// - Two pointers O(n)

class SquareOfSortedArray {
    operator fun invoke(nums: IntArray): IntArray{
        var left = 0
        var right = nums.size - 1
        val result = mutableListOf<Int>()

        while(left <= right){
            val squareLeft = nums[left] * nums [left]
            val squareRight = nums[right] * nums [right]

            if(squareLeft >= squareRight){
                result.add(0,squareLeft)
                left ++
            }
            else{
                result.add(0, squareRight)
                right --
            }
        }
        return result.toIntArray()
    }
}