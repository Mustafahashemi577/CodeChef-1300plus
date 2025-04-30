fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        var (n,x,y) = readLine()!!.split(" ").map { it.toInt() }
        val costPerHundred = if (x > y * 25) 25 * y else x
        var result = (n / 100) * costPerHundred
        n %= 100
        val remainingCost = if (Math.ceil(n / 4.0).toInt() * y > x) x else Math.ceil(n / 4.0).toInt() * y
        result += remainingCost
        println(result)
    }
}

