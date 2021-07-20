/*
A little boy is studying arithmetic. He has just learned how to add two integers, written one below another, column by column. But he always forgets about the important part - carrying.

Given two integers, your task is to find the result which the little boy will get.

Note: The boy had learned from this site, so feel free to check it out too if you are not familiar with column addition.
 */
fun additionWithoutCarrying(param1: Int, param2: Int): Int {

    var result = 0

    //the idea is to find the condition of the for loop using log of base 10
    var condition = Math.log10(Math.max(param1, param2).toDouble())+1.toInt()

    for( i in 1 .. condition.toInt()){
        var tempValue = Math.pow(10.0, i-1.0).toInt()
        var para1 = (param1 % (tempValue *10)- param1 % tempValue)/tempValue
        var para2 = (param2 %(tempValue *10)- param2 % tempValue)/ tempValue

        result += (((para1+para2)% ( tempValue*10)) % 10) * tempValue

    }

    return result
}
