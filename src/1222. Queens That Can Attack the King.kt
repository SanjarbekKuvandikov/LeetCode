fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
    val kingAttackQueens: MutableList<List<Int>> = mutableListOf()
    val kingsLocation: MutableSet<Int> = mutableSetOf()

    queens.forEach {
        kingsLocation.add(it[0]* 11 + it[1])
    }

    val moves: Array<Pair<Int, Int>> = arrayOf(
        Pair(0,-1),
        Pair(0,1),
        Pair(-1,0),
        Pair(1,0),

        Pair(-1,-1),
        Pair(1,-1),
        Pair(-1,1),
        Pair(1,1),
    )

    for (q in queens){
        val x = q[0]
        val y = q[1]

        for (m in moves){
            var maxMoves = 1

            while (maxMoves < 8){
                val xMove = m.first * maxMoves
                val yMove = m.second * maxMoves
                val location = (xMove + x) * 11 + (yMove + y)
                if (kingsLocation.contains(location)) break

                if (xMove + x >= 0 && xMove + x < 8
                    && yMove + y >= 0 && yMove + y < 8
                    && king[0] == xMove + x && king[1] == yMove + y){
                    kingAttackQueens.add(
                        listOf(x,y)
                    )
                }
                maxMoves++
            }
        }
    }

    return kingAttackQueens
}

fun main() {
    //[[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]], king = [0,0]
    val ans = queensAttacktheKing(
        queens = arrayOf(
            intArrayOf(0,1),
            intArrayOf(1,0),
            intArrayOf(4,0),
            intArrayOf(0,4),
            intArrayOf(3,3),
            intArrayOf(2,4)
        ),
        king = intArrayOf(0,0)
    )

    // [[0,1],[1,0],[3,3]]
    // [[0,1],[1,0],[3,3]]

    println(ans.toString())
}