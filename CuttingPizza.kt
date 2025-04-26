import java.util.*
fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
fun main() {
    val scan = Scanner(System.`in`)
    val t = scan.nextInt()
    repeat(t) {
        val n = scan.nextInt()
        val a = IntArray(n) { scan.nextInt() }
        val d = IntArray(n)
        for (i in 0 until n - 1) {
            d[i] = a[i + 1] - a[i]
        }
        d[n - 1] = 360 - a[n - 1] + a[0]
        var currentGCD = d[0]
        for (i in 1 until n) {
            currentGCD = gcd(currentGCD, d[i])
        }
        val totalSegments = 360 / currentGCD
        val additionalPoints = totalSegments - n
        println(additionalPoints)
    }
}

