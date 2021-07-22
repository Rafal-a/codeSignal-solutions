/*
You are given a two-digit integer n. Return the sum of its digits.

Example

For n = 29, the output should be
addTwoDigits(n) = 11.
 */
fun addTwoDigits(n: Int): Int {
    //the idead is to divide on 10

    var i =n ;
    var mod:Int = 0
    while(i!=0){

        mod+=i%10
        i=i/10

    }
    return mod
}
