/*
A rectangle with sides equal to even integers a and b is drawn on the Cartesian plane. Its center (the intersection point of its diagonals) coincides with the point (0, 0), but the sides of the rectangle are not parallel to the axes; instead, they are forming 45 degree angles with the axes.

How many points with integer coordinates are located inside the given rectangle (including on its sides)?

Example

For a = 6 and b = 4, the output should be
rectangleRotation(a, b) = 23.

The following picture illustrates the example, and the 23 points are marked green.


 */
fun rectangleRotation(a: Int, b: Int): Int {

    var x = (a/Math.sqrt(2.0)).toInt()
    var y = (b / Math.sqrt(2.0)).toInt()

    if((x + y ) % 2 == 0)
        return x * y + (x + 1) * (y + 1)

    return (x+1)* y + (y+1) * x
}
