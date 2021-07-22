/*
You're a crossword fanatic, and have finally decided to try and create your own. However, you also love symmetry and good design, so you come up with a set of rules they should follow:

the crossword must contain exactly four words;
these four words should form four pairwise intersections;
all words must be written either left-to-right or top-to-bottom;
the area of the rectangle formed by empty cells inside the intersections isn't equal to zero.
Given 4 words, find the number of ways to make a crossword following the above-described rules. Note that two crosswords which differ by rotation are considered different.

Example

For words = ["crossword", "square", "formation", "something"], the output should be
crosswordFormation(words) = 6.

The six crosswords can be formed as shown below:

  f                         f                             f
  o                     c r o s s w o r d     c r o s s w o r d
c r o s s w o r d           r   o                   q     r
  m   q                     m   m                   u     m
  a   u            ;  s q u a r e          ;        a     a
  t   a                     t   t                   r     t
  i   r                     i   h             s o m e t h i n g
s o m e t h i n g           o   i                         o
  n                         n   n                         n
                                g

    c         s               s
f o r m a t i o n       c     q               c         s
    o         m         r     u               r         o
    s q u a r e       f o r m a t i o n       o         m
    s         t    ;    s     r            ;  s q u a r e
    w         h         s o m e t h i n g     s         t
    o         i         w                     w         h
    r         n         o                   f o r m a t i o n
    d         g         r                     r         n
                        d                     d
 */
fun crosswordFormation(words: MutableList<String>): Int {

    var crosswordCount = 0

    for(i in words.indices)
        for(j in words.indices)
            for(k in words.indices)
                for(l in words.indices)
                    if((i != j) && (i != k) && (i != l) && (j != k) && (j != l) && (k != l))
                        crosswordCount += crossCheck(words[i], words[j], words[k], words[l])

    return crosswordCount
}

fun crossCheck(a: String, b: String, c: String, d: String): Int {
    var crossCheckCount = 0

    //check word[0] - Horizontal
    for(aLoop1 in 0 until a.length)
    //check word[0], but 2 chars over because crosswords - for Vertical 'D' cross
        for(aLoop2 in (aLoop1 + 2) until a.length)
        //check word[1] - Vertical
            for(bLoop1 in 0 until b.length)
            //check word[1], but 2 chars over because crosswords - for Horizontal 'C' cross
                for(bLoop2 in (bLoop1 + 2) until b.length)
                //check word[2]
                    for(cLoop1 in 0 until c.length)
                    //check word[3]
                        for(dLoop1 in 0 until d.length) {
                            var cLoop2 = cLoop1 + (aLoop2 - aLoop1)
                            var dLoop2 = dLoop1 + (bLoop2 - bLoop1)
                            //check length
                            if((cLoop2 < c.length) && (dLoop2 < d.length)) {
                                //check match
                                if((a.get(aLoop1) == b.get(bLoop1)) && (a.get(aLoop2) == d.get(dLoop1)) && (b.get                                         (bLoop2) == c.get(cLoop1)) && (c.get(cLoop2) == d.get(dLoop2))) {
                                    crossCheckCount++
                                }
                            }
                        }
    return crossCheckCount
}
