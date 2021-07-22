/*
etermine whether the given string can be obtained by one concatenation of some string to itself.

Example

For inputString = "tandemtandem", the output should be
isTandemRepeat(inputString) = true;
For inputString = "qqq", the output should be
isTandemRepeat(inputString) = false;
For inputString = "2w2ww", the output should be
isTandemRepeat(inputString) = false.
 */
fun isTandemRepeat(inputString: String): Boolean {

    if(inputString.length %2 == 0 ){
        //chuncked method will divide the string into a list with the size as a parameter
        val list = inputString.chunked(inputString.length/2 )

        return list[0] == list[1]
    }
    else
        return false
}
