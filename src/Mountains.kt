import java.util.*

data class State(val x: Int, val y: Int, val health: Int)

fun findSafeWalk(grid: List<List<Int>>, health: Int): Boolean {
    val m = grid.size
    val n = grid[0].size

    val moves = arrayOf(
        intArrayOf(-1, 0), // up
        intArrayOf(1, 0),  // down
        intArrayOf(0, -1), // left
        intArrayOf(0, 1)   // right
    )
    val newHealth = if (grid[0][0] == 1) health - 1 else health
    // BFS queue storing (x, y, remaining health)
    val queue: Queue<State> = LinkedList()
    queue.offer(State(0, 0, newHealth))

    // Visited array to keep track of the remaining health at each cell
    val visited = Array(m) { IntArray(n) { -1 } }
    visited[0][0] = newHealth

    while (queue.isNotEmpty()) {
        val current = queue.poll()
        val x = current.x
        val y = current.y
        var currentHealth = current.health
        // If we reach the bottom-right corner, return true
        if (x == m - 1 && y == n - 1) {
            return currentHealth > 0
        }

        // Explore all four possible directions
        for (move in moves) {
            val newX = x + move[0]
            val newY = y + move[1]

            // Check if the new position is within bounds
            if (newX in 0 until m && newY in 0 until n) {
                // Calculate new health after moving to this cell
                val newHealth = if (grid[newX][newY] == 1) currentHealth - 1 else currentHealth

                // Check if we have more health and we haven't visited this cell with more remaining health before
                if (newHealth > 0 && newHealth > visited[newX][newY]) {
                    visited[newX][newY] = newHealth
                    queue.offer(State(newX, newY, newHealth))
                }
            }
        }

    }
    return false
}

fun main() {
    val grid1 = listOf(
        listOf(1,1,1,1)
    )

    val health1 = 5
    println(findSafeWalk(grid1,health1))

}