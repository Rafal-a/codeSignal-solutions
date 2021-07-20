/*
Given an integer size, return array of length size filled with 1s.

Example

For size = 4, the output should be
createArray(size) = [1, 1, 1, 1].
 */
fun createArray(size: Int): MutableList<Int> {

    var listOfOnes=mutableListOf<Int>();
    var i=size
    while(i!=0){
        listOfOnes.add(1)
        --i
    }
    return listOfOnes
}
