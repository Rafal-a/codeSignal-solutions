/*
A ciphertext alphabet is obtained from the plaintext alphabet by means of rearranging some characters. For example "bacdef...xyz" will be a simple ciphertext alphabet where a and b are rearranged.

A substitution cipher is a method of encoding where each letter of the plaintext alphabet is replaced with the corresponding (i.e. having the same index) letter of some ciphertext alphabet.

Given two strings, check whether it is possible to obtain them from each other using some (possibly, different) substitution ciphers.

Example

For string1 = "aacb" and string2 = "aabc", the output should be
isSubstitutionCipher(string1, string2) = true.

Any ciphertext alphabet that starts with acb... would make this transformation possible.

For string1 = "aa" and string2 = "bc", the output should be
isSubstitutionCipher(string1, string2) = false.
 */
fun isSubstitutionCipher(string1: String, string2: String): Boolean {
    val pairedIntVal: MutableList<Int> = MutableList(26) { -1 }
    val pairedBool: MutableList<Boolean> = BooleanArray(26).toMutableList()

    for(i in 0 until string1.length) {
        val ch1 = string1[i] - 'a'
        val ch2 = string2[i] - 'a'
        if(pairedIntVal[ch1] != ch2 && (pairedBool[ch2] || pairedIntVal[ch1] != -1)) {
            return false
        }

        pairedIntVal[ch1] = ch2
        pairedBool[ch2] = true
    }

    return true
}
