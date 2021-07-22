/*
Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
adjacentElementsProduct(inputArray) = 21.

7 and 3 produce the largest product.
 */
fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {

    // since the minimum size is 2 we multiply the numbers and store then in a map
    return (1 until inputArray.size)
        .map { inputArray[it -1] * inputArray[it] }.max() ?: 0
}
