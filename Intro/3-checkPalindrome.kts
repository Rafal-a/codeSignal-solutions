/*
Given the string, check if it is a palindrome.

Example

For inputString = "aabaa", the output should be
checkPalindrome(inputString) = true;
For inputString = "abac", the output should be
checkPalindrome(inputString) = false;
For inputString = "a", the output should be
checkPalindrome(inputString) = true.
 */
fun checkPalindrome(inputString: String): Boolean {

    //reverse the input
    var reverseInputString :String = inputString.reversed();
    //check if it's  equal to the original String by ignoring small or capital cases
    if(inputString.equals(reverseInputString,ignoreCase = true )){
        return true;
    }
    else{
        return false ;
    }

}
