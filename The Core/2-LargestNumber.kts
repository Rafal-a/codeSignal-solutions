/*
iven an integer n, return the largest number that contains exactly n digits.

Example

For n = 2, the output should be
largestNumber(n) = 99.
 */
fun largestNumber(n: Int): Int {

    var nine:String = "9"
    for(i in 1 until n)
        nine+="9"

    return nine.toInt();
}
