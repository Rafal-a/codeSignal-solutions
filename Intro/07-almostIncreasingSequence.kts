/*
Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an. Sequence containing only one element is also considered to be strictly increasing.

Example

For sequence = [1, 3, 2, 1], the output should be
almostIncreasingSequence(sequence) = false.

There is no one element in this array that can be removed in order to get a strictly increasing sequence.

For sequence = [1, 3, 2], the output should be
almostIncreasingSequence(sequence) = true.

You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you can remove 2 to get the strictly increasing sequence [1, 3].
 */
fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {


    var removeCount = 0;

    var i = 0;

    while  ( i < sequence.size - 1) {

        var currentValue = sequence[i];

        var nextValue = sequence[i + 1];

        if (currentValue >= nextValue) {

            removeCount++;

            var removeCurrent : Boolean= i == 0 || sequence[i - 1] < nextValue;

            var removeNext : Boolean = i + 1 == sequence.size - 1 || currentValue < sequence[i + 2];

            if (!removeCurrent && !removeNext)
                removeCount++;

        }

        if (removeCount > 1)
            return false;

        ++i

    }

    return true;

}
