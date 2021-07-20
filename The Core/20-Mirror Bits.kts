/*
Reverse the order of the bits in a given integer.

Example

For a = 97, the output should be
mirrorBits(a) = 67.

97 equals to 1100001 in binary, which is 1000011 after mirroring, and that is 67 in base 10.

For a = 8, the output should be
mirrorBits(a) = 1.
 */
fun mirrorBits(a: Int): Int {
    var a = a

    //to bigInteger(base or radix) allows you to convert big integer numbers to binary for base/radix2 or any base/radix you want
    a = Integer.toBinaryString(a).reversed().toBigInteger(2).toInt()
    return a
}
