package problems
// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and uses only constant extra space.

// Approach: Without the extra space limitation I would use a map or set to keep track of numbers
// without the restriction to modify the array I would sort it and then compare each number with the next one
// Brute force: Compare each number with the others. O(n^2)

// Linked list circle. Floyd's algorithm https://en.wikipedia.org/wiki/Cycle_detection#Tortoise_and_hare
// 2 pointers, one slow and the other fast. If there is a duplicate then a circle will be created and the 2 pointers
// will meet. After that you need to determine the entry point of the cycle


class DuplicateNumber {

    operator fun invoke(nums: IntArray): Int {

        var slow = nums[0]
        var fast = nums[nums[0]]

        while (slow != fast) {
            slow = nums[slow]
            fast = nums[nums[fast]]
        }

        slow = 0
        while (slow != fast){
            slow = nums[slow]
            fast = nums[fast]
        }

        return slow
    }
}