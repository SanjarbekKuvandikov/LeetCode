import java.util.LinkedList
import java.util.Queue

data class State(val x: Int, val y: Int, val health: Int)

fun canReach(grid: List<List<Int>>, health: Int): Boolean {
    val m = grid.size
    val n = grid[0].size

    // Directions for moving in the grid (up, down, left, right)
    val directions = arrayOf(
        intArrayOf(-1, 0), // up
        intArrayOf(1, 0),  // down
        intArrayOf(0, -1), // left
        intArrayOf(0, 1)   // right
    )

    // BFS queue storing (x, y, remaining health)
    val queue: Queue<State> = LinkedList()
    queue.offer(State(0, 0, health))

    // Visited array to keep track of the remaining health at each cell
    val visited = Array(m) { IntArray(n) { -1 } }
    visited[0][0] = health

    while (queue.isNotEmpty()) {
        val current = queue.poll()
        val x = current.x
        val y = current.y
        var currentHealth = current.health

        // If we reach the bottom-right corner, return true
        if (x == m - 1 && y == n - 1) {
            return currentHealth > 1
        }

        // Explore all four possible directions
        for (dir in directions) {
            val newX = x + dir[0]
            val newY = y + dir[1]

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

    // If we exhaust all options without reaching the target, return false
    return false
}

fun main() {
    // [[0,1,0,0,0],[0,1,0,1,0],[0,0,0,1,0]]
    val grid1 = arrayOf(
        intArrayOf(0,1,0,0,0),
        intArrayOf(0,1,0,1,0),
        intArrayOf(0,0,0,1,0)
    )
    val health1 = 1

    // [[0,1,1,0,0,0],[1,0,1,0,0,0],[0,1,1,1,0,1],[0,0,1,0,1,0]], health = 3
    val grid2 = listOf(
        listOf(0,1,1,0,0,0),
        listOf(1,0,1,0,0,0),
        intArrayOf(0,1,1,1,0,1),
        intArrayOf(0,0,1,0,1,0)
    )
    val health2  = 3

}