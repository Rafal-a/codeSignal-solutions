/*Determine if the given number is a power of some non-negative integer.

Example

For n = 125, the output should be
isPower(n) = true;
For n = 72, the output should be
isPower(n) = false.

 */
fun isPower(n: Int): Boolean {

    var pivot:Int = Math.round(Math.sqrt(n.toDouble())).toInt()

    if(n==1)
        return true

    for(i in 2 .. pivot)
        for(j in 2 .. pivot)
            if(Math.pow(i.toDouble() , j.toDouble()) ==n.toDouble())
                return true

    return false
}
