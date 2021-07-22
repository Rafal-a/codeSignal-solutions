/*
Given an array of strings, return another array containing all of its longest strings.

Example

For inputArray = ["aba", "aa", "ad", "vcd", "aba"], the output should be
allLongestStrings(inputArray) = ["aba", "vcd", "aba"].
 */
fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    var  longestString : MutableList<String> = inputArray

    var firstString = checkLength(inputArray)

    if(inputArray.size == 1){
        longestString[0] =inputArray[0]
        return longestString;
    }

    for (i in 0 until inputArray.size-1) {
        if (firstString >=inputArray[i].length)
            longestString[i] = inputArray[i]

    }

    // filter the result ... anything that is not the same length as we used will be removed

    longestString= longestString.filter { currentString -> return@filter currentString.length == firstString } as MutableList <String>

    return longestString

}
fun checkLength(inputArray: MutableList<String>):Int{
    var maxSize=0;
    for (i in 0  ..inputArray.size-1){
        if (inputArray[i].length >= maxSize)
            maxSize = inputArray[i].length
    }

    return maxSize ;
}

