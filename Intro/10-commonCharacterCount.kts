/*
Given two strings, find the number of common characters between them.

Example

For s1 = "aabcc" and s2 = "adcaa", the output should be
commonCharacterCount(s1, s2) = 3.

Strings have 3 common characters - 2 "a"s and 1 "c".
 */
fun commonCharacterCount(s1: String, s2: String): Int {

    //use hash map to  prevent duplicates
    var shared : Int = 0
    var hash1   = IntArray(26)
    var hash2   = IntArray(26)

    for(index in 0 until s1.length)
        hash1[s1[index] - 'a']++

    for(index in 0 until s2.length)
        hash2[s2[index] - 'a']++

    for(index in 0 until 26)
        shared += Math.min(hash1[index], hash2[index])


    return shared
}
