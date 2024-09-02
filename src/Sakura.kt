/**
 *
 * Created by Anvarbek Kuvandikov
 */
private fun nextLn() = readLine()!!
private fun nextInt() = nextLn().toInt()
private fun nextString() = nextLn().toString()
private fun nextStrings() = nextLn().split(" ")
private fun nextInts() = nextStrings().map { it.toInt() }



fun main() {
    val t = nextInt()

    repeat(t){
        var(a,b) = nextInts()
        val temp = b % 2
        if (temp==1 && a>=2) {
            a -= 2
            b = 0
        }


        if (a % 2 == 0 && b %2 == 0)
            println("YES")
        else
            println("NO")


    }

}