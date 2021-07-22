/*
Find the number of ways to express n as sum of some (at least two) consecutive positive integers.

Example

For n = 9, the output should be
isSumOfConsecutive2(n) = 2.

There are two ways to represent n = 9: 2 + 3 + 4 = 9 and 4 + 5 = 9.

For n = 8, the output should be
isSumOfConsecutive2(n) = 0.

There are no ways to represent n = 8.
 */
fun isSumOfConsecutive2(n: Int): Int {

    var result:Int = 0

    for(i in 1 until n){
        var number = n
        var count:Int = i
        while(number > 0){
            number= number - count
            count++
        }

        if(number == 0)
            result++
    }

    return result
}
