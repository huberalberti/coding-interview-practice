package leetCode
//Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
// find two numbers such that they add up to a specific target number.
// Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
//
//Return the indices of the two numbers, index1 and index2, added by one as an integer
// array [index1, index2] of length 2.
//
//The tests are generated such that there is exactly one solution. You may not use the same element twice.
//
//Your solution must use only constant extra space.

//Approaches
// - Iterate array. In every step calculate (target - value) and look for that value in the rest of the array O(n^2)
// - Same as before but use binary search for the second part. O(nlogn)
// - Use two pointers. One at the start and one at the end. Sum the 2 numbers.
// If value is greater than target move end pointer. Is values is less move start pointer O(n)

class TwoSumII {
    operator fun invoke(numbers: IntArray, target: Int): IntArray{

        var leftIndex = 0
        var rightIndex = numbers.size - 1

        while (leftIndex < rightIndex){
            val sum = numbers[leftIndex] + numbers[rightIndex]
            if(sum == target){
                return intArrayOf(leftIndex + 1, rightIndex + 1)
            }
            else if (sum < target){
                leftIndex ++
            }
            else {
                rightIndex --
            }
        }
        return intArrayOf()
    }
}