package leetCode

//Write a function that reverses a string. The input string is given as an array of characters s.
//
//You must do this by modifying the input array in-place with O(1) extra memory.

// Approaches
// - 2 pointers. One at the start and one at the end. Swap both and move 1 step to the center
// - Kotlin built in reverse.

class ReverseString {

    operator fun invoke(input: CharArray): Unit {
        var leftIndex = 0
        var rightIndex = input.size - 1

        while (leftIndex < rightIndex){
            Swap(input,leftIndex,rightIndex)
            leftIndex++
            rightIndex--
        }
    }

    private fun Swap (array: CharArray, leftIndex: Int, rightIndex: Int){
        var temp = array[rightIndex]
        array[rightIndex] = array[leftIndex]
        array[leftIndex] = temp
    }
}