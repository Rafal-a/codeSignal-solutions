/*
Ticket numbers usually consist of an even number of digits. A ticket number is considered lucky if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number n, determine if it's lucky or not.

Example

For n = 1230, the output should be
isLucky(n) = true;
For n = 239017, the output should be
isLucky(n) = false.
 */
fun isLucky(n: Int): Boolean {

    var firstSum = 0
    var secondSum = 0
    var digits= 0
    var copy = n

    while(copy != 0) { digits++; copy /= 10; }

    copy = n

    for(count in 0 until digits) {

        if(count < digits / 2)
            secondSum += (copy % 10)
        else
            firstSum  += (copy % 10)

        copy /= 10

    }

    return firstSum == secondSum
}
