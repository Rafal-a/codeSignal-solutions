/*
atiorg got statues of different sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size.
 Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger
 than the previous one exactly by 1. He may need some additional statues to be able to accomplish that.
 Help him figure out the minimum number of additional statues needed.

Example

For statues = [6, 2, 3, 8], the output should be
makeArrayConsecutive2(statues) = 3.

Ratiorg needs statues of sizes 4, 5 and 7.
 */
fun makeArrayConsecutive2(statues: MutableList<Int>): Int {

    //sorting the list ascending
    statues.sort();
    //since it's sorted so the minimum number will be the first in the list
    var minValue:Int = statues[0];
    //the maximum number will be the last in the list
    var maxValue:Int = statues[statues.size -1]
    //using the equation (max value - min value )+1 - the length of the list
    return (((maxValue - minValue) +1)-statues.size)
}
