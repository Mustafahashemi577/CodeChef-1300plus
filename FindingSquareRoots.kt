import kotlin.math.sqrt
fun main() {
    repeat(readln().toInt()) {
        val n = readln().toInt()
        println(sqrt(n.toDouble()).toInt())
    }
}

