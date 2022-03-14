package misc

//Your input is a string representing a page from a book. Write code to reverse the order of letters in each word
// without reversing the order of the words.

class ReverseWords {
    operator fun invoke(input: String): String {
        var words = input.split(" ")
        var reversedWords = mutableListOf<String>()

        words.forEach { word ->
           reversedWords.add(word.reversed())
        }
        return reversedWords.joinToString(" ")
    }
}