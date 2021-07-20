/*
ome people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
 */
fun sortByHeight(a: MutableList<Int>): MutableList<Int> {

    var humans:MutableList<Int> = mutableListOf();


    for( i in 0 until a.size)
    // if not -1 then add to the list
        if(a[i] !=-1)
            humans.add(a[i])

    //sort the list
    humans.sort();

    var currentHeight:Int = 0

    for(i in 0 until a.size)
        if(a[i] != -1){
            a[i] = humans[currentHeight]
            ++currentHeight
        }

    return a

}
